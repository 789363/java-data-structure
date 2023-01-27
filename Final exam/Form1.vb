Public Class Form1

    Private Sub Button1_Click(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles Button1.Click
        '將TextBox1中的文字轉成字串陣列，並將資料轉成Path陣列
        Dim Path(7, 7) As Integer  '結點之間成本
        Dim P_log(7) As Integer '紀錄各次搜尋結果
        Dim P_point(7) As Integer  '點1~6使用紀錄

        Dim D1() As String = Split(TextBox1.Text, vbNewLine)
        Dim D2(UBound(D1))() As String
        '輸入字串的處理
        For i = 0 To UBound(D1)
            D2(i) = Split(D1(i), " ")
            Path(D2(i)(0), D2(i)(1)) = Val(D2(i)(2))
        Next
        '初始化將P_log內的值全部設為-1
        For i = 1 To 7
            P_log(i) = -1
        Next
        '初始化將起點的P_log設為0
        P_log(1) = 0
        '搜尋最短路徑
        '從點1開始跑迴圈，計算最短路徑
        For S = 1 To 6
            Dim min As Integer '目前路徑最小成本
            Dim P As Integer   '最小成本之點
            '找出目前已經使用過的點中P_log最大的那個
            For i = 1 To 6
                If P_log(i) >= min Then min = P_log(i)
            Next
            '找出P_log最小且沒有使用過的點
            For i = 1 To 6
                If P_log(i) <> -1 And P_point(i) <> 1 Then
                    If P_log(i) <= min Then min = P_log(i) : P = i
                End If
            Next
            '將結點P標記為已使用
            P_point(P) = 1
            '更新P_log陣列
            For i = 1 To 7
                If P_point(i) = 1 Or Path(P, i) = 0 Then Continue For
                If P_log(i) = -1 Then
                    P_log(i) = P_log(P) + Path(P, i)
                Else
                    P_log(i) = Math.Min(P_log(i), P_log(P) + Path(P, i)) '比較是否有更短的路徑
                End If
            Next
        Next
        '計算最短路徑
        Dim ans As String = "7"
        Dim P_back As Integer = 7
        While Strings.Left(ans, 1) <> "1"
            For i = 1 To 6
                If P_log(P_back) - Path(i, P_back) = P_log(i) And Path(i, P_back) <> 0 Then
                    ans = i & " " & ans
                    P_back = i
                    Exit For
                End If
            Next
        End While
        '顯示結果
        TextBox2.Text = "最低成本值總和：" & P_log(7) & vbNewLine
        TextBox2.Text = TextBox2.Text & "路徑次序：" & ans & vbNewLine
        TextBox2.Text = TextBox2.Text & "連線數值："
        Dim aaa() As String = Split(ans, " ")
        For i = -1 To UBound(aaa) - 1
            If i = -1 Then TextBox2.Text = TextBox2.Text & 0 & " " : Continue For
            TextBox2.Text = TextBox2.Text & Path(aaa(i), aaa(i + 1)) & " "
        Next

    End Sub
End Class
