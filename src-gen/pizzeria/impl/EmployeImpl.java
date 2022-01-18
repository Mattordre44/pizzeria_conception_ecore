/**
 */
package pizzeria.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pizzeria.Employe;
import pizzeria.Manager;
import pizzeria.PizzeriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Employe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.EmployeImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link pizzeria.impl.EmployeImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link pizzeria.impl.EmployeImpl#getSalaire <em>Salaire</em>}</li>
 *   <li>{@link pizzeria.impl.EmployeImpl#getDateDeNaissance <em>Date De Naissance</em>}</li>
 *   <li>{@link pizzeria.impl.EmployeImpl#getManager <em>Manager</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmployeImpl extends MinimalEObjectImpl.Container implements Employe {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected static final String PRENOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrenom() <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrenom()
	 * @generated
	 * @ordered
	 */
	protected String prenom = PRENOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected static final double SALAIRE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalaire() <em>Salaire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaire()
	 * @generated
	 * @ordered
	 */
	protected double salaire = SALAIRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDeNaissance() <em>Date De Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeNaissance()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DE_NAISSANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDeNaissance() <em>Date De Naissance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDeNaissance()
	 * @generated
	 * @ordered
	 */
	protected Date dateDeNaissance = DATE_DE_NAISSANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getManager() <em>Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManager()
	 * @generated
	 * @ordered
	 */
	protected Manager manager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmployeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.EMPLOYE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.EMPLOYE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrenom(String newPrenom) {
		String oldPrenom = prenom;
		prenom = newPrenom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.EMPLOYE__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalaire(double newSalaire) {
		double oldSalaire = salaire;
		salaire = newSalaire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.EMPLOYE__SALAIRE, oldSalaire,
					salaire));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateDeNaissance(Date newDateDeNaissance) {
		Date oldDateDeNaissance = dateDeNaissance;
		dateDeNaissance = newDateDeNaissance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.EMPLOYE__DATE_DE_NAISSANCE,
					oldDateDeNaissance, dateDeNaissance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager getManager() {
		if (manager != null && manager.eIsProxy()) {
			InternalEObject oldManager = (InternalEObject) manager;
			manager = (Manager) eResolveProxy(oldManager);
			if (manager != oldManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PizzeriaPackage.EMPLOYE__MANAGER,
							oldManager, manager));
			}
		}
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Manager basicGetManager() {
		return manager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManager(Manager newManager, NotificationChain msgs) {
		Manager oldManager = manager;
		manager = newManager;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PizzeriaPackage.EMPLOYE__MANAGER, oldManager, newManager);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManager(Manager newManager) {
		if (newManager != manager) {
			NotificationChain msgs = null;
			if (manager != null)
				msgs = ((InternalEObject) manager).eInverseRemove(this, PizzeriaPackage.MANAGER__EMPLOYE, Manager.class,
						msgs);
			if (newManager != null)
				msgs = ((InternalEObject) newManager).eInverseAdd(this, PizzeriaPackage.MANAGER__EMPLOYE, Manager.class,
						msgs);
			msgs = basicSetManager(newManager, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.EMPLOYE__MANAGER, newManager,
					newManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PizzeriaPackage.EMPLOYE__MANAGER:
			if (manager != null)
				msgs = ((InternalEObject) manager).eInverseRemove(this, PizzeriaPackage.MANAGER__EMPLOYE, Manager.class,
						msgs);
			return basicSetManager((Manager) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PizzeriaPackage.EMPLOYE__MANAGER:
			return basicSetManager(null, msgs);
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
		case PizzeriaPackage.EMPLOYE__NOM:
			return getNom();
		case PizzeriaPackage.EMPLOYE__PRENOM:
			return getPrenom();
		case PizzeriaPackage.EMPLOYE__SALAIRE:
			return getSalaire();
		case PizzeriaPackage.EMPLOYE__DATE_DE_NAISSANCE:
			return getDateDeNaissance();
		case PizzeriaPackage.EMPLOYE__MANAGER:
			if (resolve)
				return getManager();
			return basicGetManager();
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
		case PizzeriaPackage.EMPLOYE__NOM:
			setNom((String) newValue);
			return;
		case PizzeriaPackage.EMPLOYE__PRENOM:
			setPrenom((String) newValue);
			return;
		case PizzeriaPackage.EMPLOYE__SALAIRE:
			setSalaire((Double) newValue);
			return;
		case PizzeriaPackage.EMPLOYE__DATE_DE_NAISSANCE:
			setDateDeNaissance((Date) newValue);
			return;
		case PizzeriaPackage.EMPLOYE__MANAGER:
			setManager((Manager) newValue);
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
		case PizzeriaPackage.EMPLOYE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case PizzeriaPackage.EMPLOYE__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case PizzeriaPackage.EMPLOYE__SALAIRE:
			setSalaire(SALAIRE_EDEFAULT);
			return;
		case PizzeriaPackage.EMPLOYE__DATE_DE_NAISSANCE:
			setDateDeNaissance(DATE_DE_NAISSANCE_EDEFAULT);
			return;
		case PizzeriaPackage.EMPLOYE__MANAGER:
			setManager((Manager) null);
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
		case PizzeriaPackage.EMPLOYE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case PizzeriaPackage.EMPLOYE__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case PizzeriaPackage.EMPLOYE__SALAIRE:
			return salaire != SALAIRE_EDEFAULT;
		case PizzeriaPackage.EMPLOYE__DATE_DE_NAISSANCE:
			return DATE_DE_NAISSANCE_EDEFAULT == null ? dateDeNaissance != null
					: !DATE_DE_NAISSANCE_EDEFAULT.equals(dateDeNaissance);
		case PizzeriaPackage.EMPLOYE__MANAGER:
			return manager != null;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(", salaire: ");
		result.append(salaire);
		result.append(", dateDeNaissance: ");
		result.append(dateDeNaissance);
		result.append(')');
		return result.toString();
	}

} //EmployeImpl
