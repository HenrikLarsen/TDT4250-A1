/**
 */
package Program.impl;

import Program.Course;
import Program.CourseStatus;
import Program.ProgramPackage;
import Program.SemesterCourse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Program.impl.SemesterCourseImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link Program.impl.SemesterCourseImpl#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterCourseImpl extends MinimalEObjectImpl.Container implements SemesterCourse {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final CourseStatus STATUS_EDEFAULT = CourseStatus.MANDATORY;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected CourseStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected Course courses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterCourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProgramPackage.Literals.SEMESTER_COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(CourseStatus newStatus) {
		CourseStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.SEMESTER_COURSE__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Course getCourses() {
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourses(Course newCourses, NotificationChain msgs) {
		Course oldCourses = courses;
		courses = newCourses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ProgramPackage.SEMESTER_COURSE__COURSES, oldCourses, newCourses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourses(Course newCourses) {
		if (newCourses != courses) {
			NotificationChain msgs = null;
			if (courses != null)
				msgs = ((InternalEObject)courses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.SEMESTER_COURSE__COURSES, null, msgs);
			if (newCourses != null)
				msgs = ((InternalEObject)newCourses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ProgramPackage.SEMESTER_COURSE__COURSES, null, msgs);
			msgs = basicSetCourses(newCourses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProgramPackage.SEMESTER_COURSE__COURSES, newCourses, newCourses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ProgramPackage.SEMESTER_COURSE__COURSES:
				return basicSetCourses(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ProgramPackage.SEMESTER_COURSE__STATUS:
				return getStatus();
			case ProgramPackage.SEMESTER_COURSE__COURSES:
				return getCourses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ProgramPackage.SEMESTER_COURSE__STATUS:
				setStatus((CourseStatus)newValue);
				return;
			case ProgramPackage.SEMESTER_COURSE__COURSES:
				setCourses((Course)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ProgramPackage.SEMESTER_COURSE__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ProgramPackage.SEMESTER_COURSE__COURSES:
				setCourses((Course)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ProgramPackage.SEMESTER_COURSE__STATUS:
				return status != STATUS_EDEFAULT;
			case ProgramPackage.SEMESTER_COURSE__COURSES:
				return courses != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //SemesterCourseImpl
