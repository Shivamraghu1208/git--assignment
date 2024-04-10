c class ArmstrongNumber {
    public boolean isArmstrong(int num)
    {
        int temp;
        int digit=0;
        int last;
        int sum=0;

        temp=num;
        while (temp>0)
        {
            temp=temp/10;
            digit++;
        }
        temp=num;
        while (temp>0)
        {
            last=temp%10;
            sum+=(Math.pow(last,digit));
            temp=temp/10;
        }
        if(num==sum)
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number=153;
        ArmstrongNumber num=new ArmstrongNumber();
        num.isArmstrong(number);
        if (num.isArmstrong(number))
        {
            System.out.println(number+" is Armstrong ");
        }
        else
        {
            System.out.println(number+" is  not Armstrong ");
        }

    }
}

