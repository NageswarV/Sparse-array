class SparseArray{
   static int[] matchingStrings(String[] strings, String[] queries) {
        int result[]=new int[queries.length];
        int index=0;
        for(String query :queries)
        { int count=0;
            for(String value:strings)
            {
                if(value.equals(query))
                    count++;
            }
            result[index++]=count;
        }
        return result;
    }
}