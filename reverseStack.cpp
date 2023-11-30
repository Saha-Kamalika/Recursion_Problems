class Solution{
public:
    void insert(stack<int> &St,int val){
        if(St.size()==0) 
        {
            St.push(val);
            return;
        }
        int temp=St.top();
        St.pop();
        insert(St,val);
        St.push(temp);
        return;
    }
    void Reverse(stack<int> &St){
        if(St.size()==1) return;
        int temp=St.top();
        St.pop();
        Reverse(St);
        insert(St,temp);
        return;
    }
};
