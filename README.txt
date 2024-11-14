Complexity Pertanyaan nomor 02
==============================
Logic : 
	- Input masuk dan hilangkan whitespace dengan replaceAll
	- Panggil function dalam if untuk process input
	- Dalam function String diubah menjadi Array of char
	- Buat stack baru
	- Loop sebanyak jumlah array of char
	- Bila char curr merupakan awalan ( [ { maka akan di push ke antrian dan continue ke loop
	selanjutnya karena logic bawah sudah pasti tidak sesuai dengan char curruntuk menghemat 
	processing time karena switch case dibawah untuk processing ) ] }
	- Bila char berisikan ) ] } maka masuk ke switch case yang didalamnya akan dilakukan pop ke stack
	bila tumpukan teratas sesuai/sama dengan pasangan char curr (misal () atau [] atau {})
	- Bila tidak sesuai maka akan return false karena tidak balance, misal (] dengan {) atau [}
	- function if(stack.isEmpty()){return false;} untuk menjaga bila ada ) ] } yang tersisa padahal 
	stack sudah kosong ('(','[','{' sudah habis yang ada di stack)
	
Complexity tidak begitu kompleks karena dalam codingan diusahakan untuk tidak membuat variable yang tidak 
dibutuhkan seperti pemanggilan "checkBalance(processedInputString)" dari main tidak disimpan dalam variable,
namun langsung digunakan dalam if else sehingga menghemat memory, dalam codingan terdapat juga "continue;" 
yang digunakan untuk menghemat time sehingga saat sudah push ke stack, tidak menjalankan switch case dibawahnya
dan dapat langsung menjalankan loopingan selanjutnya.

Code yang dibuat telah dibuat sesuai dengan format yang umumnya digunakan developer2 lain seperti cammel case,
tidak spagetty code/berantakan margin serta space yang rapi sehingga mudah untuk dipelajari dan direuse
oleh developer lainnya.