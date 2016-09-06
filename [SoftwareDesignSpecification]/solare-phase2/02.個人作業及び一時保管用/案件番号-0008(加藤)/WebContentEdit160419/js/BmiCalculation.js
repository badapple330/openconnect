        function BmiCalculation(form){
            height2 = form.height.value*form.height.value;    //身長（m）の2乗
            bmi = form.weight.value/height2         //体重÷身長の2乗
            bmi = Math.round(form.weight.value/height2);        //小数点以下四捨五入

            form.bmi.value = bmi;

        }