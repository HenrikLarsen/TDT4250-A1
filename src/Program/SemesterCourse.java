/**
 */
package Program;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.SemesterCourse#getStatus <em>Status</em>}</li>
 *   <li>{@link Program.SemesterCourse#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getSemesterCourse()
 * @model
 * @generated
 */
public interface SemesterCourse extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link Program.CourseStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see Program.CourseStatus
	 * @see #setStatus(CourseStatus)
	 * @see Program.ProgramPackage#getSemesterCourse_Status()
	 * @model
	 * @generated
	 */
	CourseStatus getStatus();

	/**
	 * Sets the value of the '{@link Program.SemesterCourse#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see Program.CourseStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(CourseStatus value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference.
	 * @see #setCourses(Course)
	 * @see Program.ProgramPackage#getSemesterCourse_Courses()
	 * @model containment="true"
	 * @generated
	 */
	Course getCourses();

	/**
	 * Sets the value of the '{@link Program.SemesterCourse#getCourses <em>Courses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Courses</em>' containment reference.
	 * @see #getCourses()
	 * @generated
	 */
	void setCourses(Course value);

} // SemesterCourse
