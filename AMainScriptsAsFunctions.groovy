Closure calcHome = { DHParameterKinematics leg -> 
		TransformNR h=leg.calcHome() 

		TransformNR tr = leg.forwardOffset(new TransformNR())
		tr.setZ(zLock)
		
		return h;

}