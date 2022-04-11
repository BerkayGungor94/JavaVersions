package java8.functional;

/** Yalnızca bir absract metodu olan interface'lere Funcitonal Interface denir.
  "FunctionalInterface" anotasyonu kullanması zorunlu değildir. Eğer anotasyon eklenirse ve birden fazla abstract metot
  eklenmeye çalışılırsa, bu durumda compile error verecektir. İçerisinde birden fazla static ve default metodlar barındırabilir.
 */
@FunctionalInterface
public interface Math {
   abstract void operation (int a, int b);
}
