import java.io.*;
import java.util.*;
class star_pattern10
    {
        public void main()
        
        {
            int n=7,count=1;
            for(int i =1;i<=n;i++)
            {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count++);
            }
            System.out.println(" ");
        }
    }
}