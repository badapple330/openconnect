dim w,a,input,err,errL,sh,A1,N,S1,S2
errL = 0

set w = CreateObject("WScript.Shell")
	N = "‚©"
Set ST = CreateObject("Shell.Application")
	A1 = "‚¹"
ST.ToggleDesktop()
do
	w.Popup "‚¢‚¦[‚¢", 1, "Title", vbInformation Or vbSystemModal
	WScript.Sleep (100)
	S1 = "i"
	a = a + 1
	S2 = S1
	if a = 5 then
		input = inputbox("³‰ð‚ð“ü—Í‚µ‚Ä‚Ë")
		if input = A1 & S1 & N & S2 then
			if err > 0 then
				MsgBox "‚ ‚È‚½‚Í" & err & "‰ñŠÔˆá‚¦‚Ü‚µ‚½‚Ë",vbInformation Or vbSystemModal,"HAHAHA"
			end if
			do while errL < err * err
				errL = errL + 1
				w.Popup "ŠÔˆá‚Á‚½‰ñ”~ŠÔˆá‚Á‚½‰ñ”•ª•\Ž¦‚³‚ê‚Ü‚·()", 1, err*err & "‰ñ", vbInformation Or vbSystemModal
				WScript.Sleep 100
				Set sh = WScript.CreateObject( "WScript.Shell" )
				sh.Run( "notepad.exe" )
				WScript.Sleep( 1000 )
				sh.SendKeys( "You" )
				sh.SendKeys( " " )
				WScript.Sleep( 700 ) 
				sh.SendKeys( "are" )
				sh.SendKeys( " " )
				WScript.Sleep( 700 ) 
				sh.SendKeys( "an" )
				sh.SendKeys( " " )
				WScript.Sleep( 700 ) 
				sh.SendKeys( "idiot!" )
				sh.SendKeys( " " )
				WScript.Sleep( 700 ) 
				sh.SendKeys( "{ENTER}" )
				WScript.Sleep( 700 ) 
				sh.SendKeys( "Ahahahahahaha!!" )  
				WScript.Sleep( 700 )
				sh.SendKeys( "ahahahaha!" )  
				WScript.Sleep( 1000 )
				sh = null
			loop

			Exit Do
		else 
			w.Popup "‚´‚ñ‚Ë`‚ñ", 1, "Title", vbInformation
			err = err + 1
			a = 0 
		end if
	end if
loop
Msgbox "‰³`"
