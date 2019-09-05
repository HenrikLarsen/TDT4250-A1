/**
 */
package Program;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Program.Semester#getName <em>Name</em>}</li>
 *   <li>{@link Program.Semester#getCode <em>Code</em>}</li>
 *   <li>{@link Program.Semester#getSemesterCourses <em>Semester Courses</em>}</li>
 * </ul>
 *
 * @see Program.ProgramPackage#getSemester()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='min30Credits'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 min30Credits='OCL'"
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Program.ProgramPackage#getSemester_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Program.Semester#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see Program.ProgramPackage#getSemester_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link Program.Semester#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Semester Courses</b></em>' containment reference list.
	 * The list contents are of type {@link Program.SemesterCourse}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Courses</em>' containment reference list.
	 * @see Program.ProgramPackage#getSemester_SemesterCourses()
	 * @model containment="true"
	 * @generated
	 */
	EList<SemesterCourse> getSemesterCourses();

} // Semester
