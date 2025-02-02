// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityCertificateRevocationListIamPolicyArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityIamPolicyArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityIamPolicyPlainArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificateAuthorityPlainArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetCertificatePlainArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetReusableConfigIamPolicyArgs;
import com.pulumi.googlenative.privateca_v1beta1.inputs.GetReusableConfigIamPolicyPlainArgs;
import com.pulumi.googlenative.privateca_v1beta1.outputs.GetCertificateAuthorityCertificateRevocationListIamPolicyResult;
import com.pulumi.googlenative.privateca_v1beta1.outputs.GetCertificateAuthorityIamPolicyResult;
import com.pulumi.googlenative.privateca_v1beta1.outputs.GetCertificateAuthorityResult;
import com.pulumi.googlenative.privateca_v1beta1.outputs.GetCertificateResult;
import com.pulumi.googlenative.privateca_v1beta1.outputs.GetReusableConfigIamPolicyResult;
import java.util.concurrent.CompletableFuture;

public final class Privateca_v1beta1Functions {
    /**
     * Returns a Certificate.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args) {
        return getCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Returns a Certificate.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args) {
        return getCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns a Certificate.
     * 
     */
    public static Output<GetCertificateResult> getCertificate(GetCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:privateca/v1beta1:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a Certificate.
     * 
     */
    public static CompletableFuture<GetCertificateResult> getCertificatePlain(GetCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getCertificate", TypeShape.of(GetCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a CertificateAuthority.
     * 
     */
    public static Output<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args) {
        return getCertificateAuthority(args, InvokeOptions.Empty);
    }
    /**
     * Returns a CertificateAuthority.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthorityPlain(GetCertificateAuthorityPlainArgs args) {
        return getCertificateAuthorityPlain(args, InvokeOptions.Empty);
    }
    /**
     * Returns a CertificateAuthority.
     * 
     */
    public static Output<GetCertificateAuthorityResult> getCertificateAuthority(GetCertificateAuthorityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:privateca/v1beta1:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Returns a CertificateAuthority.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityResult> getCertificateAuthorityPlain(GetCertificateAuthorityPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getCertificateAuthority", TypeShape.of(GetCertificateAuthorityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetCertificateAuthorityCertificateRevocationListIamPolicyResult> getCertificateAuthorityCertificateRevocationListIamPolicy(GetCertificateAuthorityCertificateRevocationListIamPolicyArgs args) {
        return getCertificateAuthorityCertificateRevocationListIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityCertificateRevocationListIamPolicyResult> getCertificateAuthorityCertificateRevocationListIamPolicyPlain(GetCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs args) {
        return getCertificateAuthorityCertificateRevocationListIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetCertificateAuthorityCertificateRevocationListIamPolicyResult> getCertificateAuthorityCertificateRevocationListIamPolicy(GetCertificateAuthorityCertificateRevocationListIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:privateca/v1beta1:getCertificateAuthorityCertificateRevocationListIamPolicy", TypeShape.of(GetCertificateAuthorityCertificateRevocationListIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityCertificateRevocationListIamPolicyResult> getCertificateAuthorityCertificateRevocationListIamPolicyPlain(GetCertificateAuthorityCertificateRevocationListIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getCertificateAuthorityCertificateRevocationListIamPolicy", TypeShape.of(GetCertificateAuthorityCertificateRevocationListIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetCertificateAuthorityIamPolicyResult> getCertificateAuthorityIamPolicy(GetCertificateAuthorityIamPolicyArgs args) {
        return getCertificateAuthorityIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityIamPolicyResult> getCertificateAuthorityIamPolicyPlain(GetCertificateAuthorityIamPolicyPlainArgs args) {
        return getCertificateAuthorityIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetCertificateAuthorityIamPolicyResult> getCertificateAuthorityIamPolicy(GetCertificateAuthorityIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:privateca/v1beta1:getCertificateAuthorityIamPolicy", TypeShape.of(GetCertificateAuthorityIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetCertificateAuthorityIamPolicyResult> getCertificateAuthorityIamPolicyPlain(GetCertificateAuthorityIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getCertificateAuthorityIamPolicy", TypeShape.of(GetCertificateAuthorityIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetReusableConfigIamPolicyResult> getReusableConfigIamPolicy(GetReusableConfigIamPolicyArgs args) {
        return getReusableConfigIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetReusableConfigIamPolicyResult> getReusableConfigIamPolicyPlain(GetReusableConfigIamPolicyPlainArgs args) {
        return getReusableConfigIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static Output<GetReusableConfigIamPolicyResult> getReusableConfigIamPolicy(GetReusableConfigIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:privateca/v1beta1:getReusableConfigIamPolicy", TypeShape.of(GetReusableConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set.
     * 
     */
    public static CompletableFuture<GetReusableConfigIamPolicyResult> getReusableConfigIamPolicyPlain(GetReusableConfigIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:privateca/v1beta1:getReusableConfigIamPolicy", TypeShape.of(GetReusableConfigIamPolicyResult.class), args, Utilities.withVersion(options));
    }
}
