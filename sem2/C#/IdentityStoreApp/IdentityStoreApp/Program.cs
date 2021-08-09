using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IdentityStoreApp
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter the names to be concatenated");
            Console.WriteLine("Enter first name");
            string firstText;
            firstText = Console.ReadLine();
            Console.WriteLine("Enter second name");
            string secondText;
            secondText = Console.ReadLine();
            string concatenatedString = firstText + " " + secondText;
            Console.WriteLine(concatenatedString);
            Console.ReadKey(false);
        }
    }
}
