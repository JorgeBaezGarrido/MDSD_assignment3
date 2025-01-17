/**
 * generated by Xtext 2.21.0
 */
package mdsd.mathCompiler.impl;

import java.util.Collection;

import mdsd.mathCompiler.Expressions;
import mdsd.mathCompiler.MathCompilerPackage;
import mdsd.mathCompiler.MathExp;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expressions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mdsd.mathCompiler.impl.ExpressionsImpl#getExpressions <em>Expressions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionsImpl extends MinimalEObjectImpl.Container implements Expressions
{
  /**
   * The cached value of the '{@link #getExpressions() <em>Expressions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpressions()
   * @generated
   * @ordered
   */
  protected EList<MathExp> expressions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MathCompilerPackage.Literals.EXPRESSIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MathExp> getExpressions()
  {
    if (expressions == null)
    {
      expressions = new EObjectContainmentEList<MathExp>(MathExp.class, this, MathCompilerPackage.EXPRESSIONS__EXPRESSIONS);
    }
    return expressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case MathCompilerPackage.EXPRESSIONS__EXPRESSIONS:
        return ((InternalEList<?>)getExpressions()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MathCompilerPackage.EXPRESSIONS__EXPRESSIONS:
        return getExpressions();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MathCompilerPackage.EXPRESSIONS__EXPRESSIONS:
        getExpressions().clear();
        getExpressions().addAll((Collection<? extends MathExp>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MathCompilerPackage.EXPRESSIONS__EXPRESSIONS:
        getExpressions().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MathCompilerPackage.EXPRESSIONS__EXPRESSIONS:
        return expressions != null && !expressions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpressionsImpl
