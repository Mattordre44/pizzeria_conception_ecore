/**
 */
package pizzeria.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pizzeria.Client;
import pizzeria.Livreur;
import pizzeria.PizzeriaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Client</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pizzeria.impl.ClientImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link pizzeria.impl.ClientImpl#getPrenom <em>Prenom</em>}</li>
 *   <li>{@link pizzeria.impl.ClientImpl#getNumeroDeTelephone <em>Numero De Telephone</em>}</li>
 *   <li>{@link pizzeria.impl.ClientImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link pizzeria.impl.ClientImpl#getLivreur <em>Livreur</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClientImpl extends MinimalEObjectImpl.Container implements Client {
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
	 * The default value of the '{@link #getNumeroDeTelephone() <em>Numero De Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDeTelephone()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMERO_DE_TELEPHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumeroDeTelephone() <em>Numero De Telephone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumeroDeTelephone()
	 * @generated
	 * @ordered
	 */
	protected String numeroDeTelephone = NUMERO_DE_TELEPHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLivreur() <em>Livreur</em>}' reference.
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
	protected ClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PizzeriaPackage.Literals.CLIENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.CLIENT__NOM, oldNom, nom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.CLIENT__PRENOM, oldPrenom, prenom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumeroDeTelephone(String newNumeroDeTelephone) {
		String oldNumeroDeTelephone = numeroDeTelephone;
		numeroDeTelephone = newNumeroDeTelephone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.CLIENT__NUMERO_DE_TELEPHONE,
					oldNumeroDeTelephone, numeroDeTelephone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.CLIENT__ADRESSE, oldAdresse,
					adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livreur getLivreur() {
		if (livreur != null && livreur.eIsProxy()) {
			InternalEObject oldLivreur = (InternalEObject) livreur;
			livreur = (Livreur) eResolveProxy(oldLivreur);
			if (livreur != oldLivreur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PizzeriaPackage.CLIENT__LIVREUR,
							oldLivreur, livreur));
			}
		}
		return livreur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Livreur basicGetLivreur() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PizzeriaPackage.CLIENT__LIVREUR, oldLivreur, newLivreur);
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
	public void setLivreur(Livreur newLivreur) {
		if (newLivreur != livreur) {
			NotificationChain msgs = null;
			if (livreur != null)
				msgs = ((InternalEObject) livreur).eInverseRemove(this, PizzeriaPackage.LIVREUR__CLIENT, Livreur.class,
						msgs);
			if (newLivreur != null)
				msgs = ((InternalEObject) newLivreur).eInverseAdd(this, PizzeriaPackage.LIVREUR__CLIENT, Livreur.class,
						msgs);
			msgs = basicSetLivreur(newLivreur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PizzeriaPackage.CLIENT__LIVREUR, newLivreur,
					newLivreur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PizzeriaPackage.CLIENT__LIVREUR:
			if (livreur != null)
				msgs = ((InternalEObject) livreur).eInverseRemove(this, PizzeriaPackage.LIVREUR__CLIENT, Livreur.class,
						msgs);
			return basicSetLivreur((Livreur) otherEnd, msgs);
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
		case PizzeriaPackage.CLIENT__LIVREUR:
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
		case PizzeriaPackage.CLIENT__NOM:
			return getNom();
		case PizzeriaPackage.CLIENT__PRENOM:
			return getPrenom();
		case PizzeriaPackage.CLIENT__NUMERO_DE_TELEPHONE:
			return getNumeroDeTelephone();
		case PizzeriaPackage.CLIENT__ADRESSE:
			return getAdresse();
		case PizzeriaPackage.CLIENT__LIVREUR:
			if (resolve)
				return getLivreur();
			return basicGetLivreur();
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
		case PizzeriaPackage.CLIENT__NOM:
			setNom((String) newValue);
			return;
		case PizzeriaPackage.CLIENT__PRENOM:
			setPrenom((String) newValue);
			return;
		case PizzeriaPackage.CLIENT__NUMERO_DE_TELEPHONE:
			setNumeroDeTelephone((String) newValue);
			return;
		case PizzeriaPackage.CLIENT__ADRESSE:
			setAdresse((String) newValue);
			return;
		case PizzeriaPackage.CLIENT__LIVREUR:
			setLivreur((Livreur) newValue);
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
		case PizzeriaPackage.CLIENT__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case PizzeriaPackage.CLIENT__PRENOM:
			setPrenom(PRENOM_EDEFAULT);
			return;
		case PizzeriaPackage.CLIENT__NUMERO_DE_TELEPHONE:
			setNumeroDeTelephone(NUMERO_DE_TELEPHONE_EDEFAULT);
			return;
		case PizzeriaPackage.CLIENT__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case PizzeriaPackage.CLIENT__LIVREUR:
			setLivreur((Livreur) null);
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
		case PizzeriaPackage.CLIENT__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case PizzeriaPackage.CLIENT__PRENOM:
			return PRENOM_EDEFAULT == null ? prenom != null : !PRENOM_EDEFAULT.equals(prenom);
		case PizzeriaPackage.CLIENT__NUMERO_DE_TELEPHONE:
			return NUMERO_DE_TELEPHONE_EDEFAULT == null ? numeroDeTelephone != null
					: !NUMERO_DE_TELEPHONE_EDEFAULT.equals(numeroDeTelephone);
		case PizzeriaPackage.CLIENT__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case PizzeriaPackage.CLIENT__LIVREUR:
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", prenom: ");
		result.append(prenom);
		result.append(", numeroDeTelephone: ");
		result.append(numeroDeTelephone);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(')');
		return result.toString();
	}

} //ClientImpl
