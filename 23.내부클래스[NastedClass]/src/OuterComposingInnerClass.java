
public class OuterComposingInnerClass {
	public int outer_member_filed;
	public void outer_member_method() {
		System.out.println("OuterComposingInnercalss.outer_member_method()");
	}
	/**********Outer클래스에서 Inner클래스 사용**********/
	public void outer_inner_class_use() {
		/*
		 * local
		 */
		int local_variable=100;
		/******************************case1************************************************************		
		ParentFirstConcreteClass childFirstConcreteClass = new ChildFirstConcreteClass();
		childFirstConcreteClass.local_inner_outer_access();
		************************************************************************************************/
		/*
		 * <<특정클래스의 메쏘드를 재정의해야할때>>
		 *  1. local위치   에서 클래스를 정의
		 *  2. local위치(?)에서 객체를 생성
		 *  
		 */
		/*************************** anonymous local inner class********************************/
		ParentFirstConcreteClass childConcreteClass = new ParentFirstConcreteClass(){
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentFirstConcreteClass를 상속받는 anonymousClass(이름없는로칼클래스)에서 재정의한 local_inner_outer_access()");
			}
		};
		childConcreteClass.local_inner_outer_access();
		
		
		ParentSecondAbstractClass childAbstractClass = new ParentSecondAbstractClass() {
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentFirstConcreteClass를 상속받는 anonymousClass(이름없는로칼클래스)에서 재정의한 local_inner_outer_access()");
			}
		};
		childAbstractClass.local_inner_outer_access();
		
		ParentThirdInterFace childInterFace = new ParentThirdInterFace() {
			
			@Override
			public void local_inner_outer_access() {
				System.out.println("ParentThirdInterFace를 상속받은(구현한) anonymousClass(이름없는로칼클래스)에서 재정의한 local_inner_outer_access()");
			}
		};
		childInterFace.local_inner_outer_access();

	
	}//end method
	
	
	/**********ParentFirstConcreteClass를 상속받고 public void local_inner_outer_access()메쏘드를 재정의하는 Inner클래스**********/
	//public class ChildFirstConcreateClass extends ParentFirstConcreteClass
	/*
	public class childSecondAbstractClass extends ParentSecondAbstractClass{

		@Override
		public void local_inner_outer_access() {
			System.out.println("ParentFirstConcreteClass를 상속받는 ChildSecondConcreateClass에서 재정의한 local_inner_outer_access()\"");
		}
		
	}
	*/
	
	public static void main(String[] args) {
		OuterComposingInnerClass outerComposingInnerClass = new OuterComposingInnerClass();
		outerComposingInnerClass.outer_inner_class_use();
	}
}
