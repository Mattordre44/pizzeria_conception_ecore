/**
 */
package pizzeria.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import pizzeria.Livreur;
import pizzeria.PizzeriaPackage;
import pizzeria.Vehicule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.VehiculeImpl#getImattriculation <em>Imattriculation</em>}</li>
 *   <li>{@link pizzeria.impl.VehiculeImpl#getNiveauEssence <em>Niveau Essence</em>}</li>
 *   <li>{@link pizzeria.impl.VehiculeImpl#isEstFonctionnel <em>Est Fonctionnel</em>}</li>
 *   <li>{@link pizzeria.impl.VehiculeImpl#getLivreur <em>Livreur</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class VehiculeImpl extends MinimalEObjectImpl.Container implements Vehicule {
	/**
	 * The default value of the '{@link #getImattriculation() <em>Imattriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImattriculation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMATTRICULATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImattriculation() <em>Imattriculation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImattriculation()
	 * @generated
	 * @ordered
	 */
	protected String imattriculation = IMATTRICULATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getNiveauEssence() <em>Niveau Essence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEssence()
	 * @generated
	 * @ordered
	 */
	protected static final double NIVEAU_ESSENCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getNiveauEssence() <em>Niveau Essence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveauEssence()
	 * @generated
	 * @ordered
	 */
	protected double niveauEssence = NIVEAU_ESSENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isEstFonctionnel() <em>Est Fonctionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstFonctionnel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EST_FONCTIONNEL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEstFonctionnel() <em>Est Fonctionnel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEstFonctionnel()
	 * @generated
	 * @ordered
	 */
	protected boolean estFonctionnel = EST_FONCTIONNEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLivreur() <em>Livreur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLivreur()
	 * @generated
	 * @ordered
	 */
	protected Livreur livreur;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehiculeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.VEHICULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImattriculation() {
		return imattriculation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImattriculation(String newImattriculation) {
		String oldImattriculation = imattriculation;
		imattriculation = newImattriculation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.VEHICULE__IMATTRICULATION, oldImattriculation, imattriculation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getNiveauEssence() {
		return niveauEssence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveauEssence(double newNiveauEssence) {
		double oldNiveauEssence = niveauEssence;
		niveauEssence = newNiveauEssence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.VEHICULE__NIVEAU_ESSENCE, oldNiveauEssence, niveauEssence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEstFonctionnel() {
		return estFonctionnel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstFonctionnel(boolean newEstFonctionnel) {
		boolean oldEstFonctionnel = estFonctionnel;
		estFonctionnel = newEstFonctionnel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.VEHICULE__EST_FONCTIONNEL, oldEstFonctionnel, estFonctionnel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livreur getLivreur() {
		return livreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLivreur(Livreur newLivreur, NotificationChain msgs) {
		Livreur oldLivreur = livreur;
		livreur = newLivreur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PizzeriaPackage.VEHICULE__LIVREUR, oldLivreur, newLivreur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLivreur(Livreur newLivreur) {
		if (newLivreur != livreur) {
			NotificationChain msgs = null;
			if (livreur != null)
				msgs = ((InternalEObject)livreur).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PizzeriaPackage.VEHICULE__LIVREUR, null, msgs);
			if (newLivreur != null)
				msgs = ((InternalEObject)newLivreur).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PizzeriaPackage.VEHICULE__LIVREUR, null, msgs);
			msgs = basicSetLivreur(newLivreur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.VEHICULE__LIVREUR, newLivreur, newLivreur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PizzeriaPackage.VEHICULE__LIVREUR:
				return basicSetLivreur(null, msgs);
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
			case PizzeriaPackage.VEHICULE__IMATTRICULATION:
				return getImattriculation();
			case PizzeriaPackage.VEHICULE__NIVEAU_ESSENCE:
				return getNiveauEssence();
			case PizzeriaPackage.VEHICULE__EST_FONCTIONNEL:
				return isEstFonctionnel();
			case PizzeriaPackage.VEHICULE__LIVREUR:
				return getLivreur();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PizzeriaPackage.VEHICULE__IMATTRICULATION:
				setImattriculation((String)newValue);
				return;
			case PizzeriaPackage.VEHICULE__NIVEAU_ESSENCE:
				setNiveauEssence((Double)newValue);
				return;
			case PizzeriaPackage.VEHICULE__EST_FONCTIONNEL:
				setEstFonctionnel((Boolean)newValue);
				return;
			case PizzeriaPackage.VEHICULE__LIVREUR:
				setLivreur((Livreur)newValue);
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
			case PizzeriaPackage.VEHICULE__IMATTRICULATION:
				setImattriculation(IMATTRICULATION_EDEFAULT);
				return;
			case PizzeriaPackage.VEHICULE__NIVEAU_ESSENCE:
				setNiveauEssence(NIVEAU_ESSENCE_EDEFAULT);
				return;
			case PizzeriaPackage.VEHICULE__EST_FONCTIONNEL:
				setEstFonctionnel(EST_FONCTIONNEL_EDEFAULT);
				return;
			case PizzeriaPackage.VEHICULE__LIVREUR:
				setLivreur((Livreur)null);
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
			case PizzeriaPackage.VEHICULE__IMATTRICULATION:
				return IMATTRICULATION_EDEFAULT == null ? imattriculation != null : !IMATTRICULATION_EDEFAULT.equals(imattriculation);
			case PizzeriaPackage.VEHICULE__NIVEAU_ESSENCE:
				return niveauEssence != NIVEAU_ESSENCE_EDEFAULT;
			case PizzeriaPackage.VEHICULE__EST_FONCTIONNEL:
				return estFonctionnel != EST_FONCTIONNEL_EDEFAULT;
			case PizzeriaPackage.VEHICULE__LIVREUR:
				return livreur != null;
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
		result.append(" (imattriculation: ");
		result.append(imattriculation);
		result.append(", niveauEssence: ");
		result.append(niveauEssence);
		result.append(", estFonctionnel: ");
		result.append(estFonctionnel);
		result.append(')');
		return result.toString();
	}

} //VehiculeImpl
