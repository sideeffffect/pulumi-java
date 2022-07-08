// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.appengine.v1.inputs.GetAppArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetAppPlainArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetAuthorizedCertificateArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetAuthorizedCertificatePlainArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetDomainMappingArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetDomainMappingPlainArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetIngressRuleArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetIngressRulePlainArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetVersionArgs;
import com.pulumi.googlenative.appengine.v1.inputs.GetVersionPlainArgs;
import com.pulumi.googlenative.appengine.v1.outputs.GetAppResult;
import com.pulumi.googlenative.appengine.v1.outputs.GetAuthorizedCertificateResult;
import com.pulumi.googlenative.appengine.v1.outputs.GetDomainMappingResult;
import com.pulumi.googlenative.appengine.v1.outputs.GetIngressRuleResult;
import com.pulumi.googlenative.appengine.v1.outputs.GetVersionResult;
import java.util.concurrent.CompletableFuture;

public final class Appengine_v1Functions {
    /**
     * Gets information about an application.
     * 
     */
    public static Output<GetAppResult> getApp(GetAppArgs args) {
        return getApp(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about an application.
     * 
     */
    public static CompletableFuture<GetAppResult> getAppPlain(GetAppPlainArgs args) {
        return getAppPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets information about an application.
     * 
     */
    public static Output<GetAppResult> getApp(GetAppArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:appengine/v1:getApp", TypeShape.of(GetAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets information about an application.
     * 
     */
    public static CompletableFuture<GetAppResult> getAppPlain(GetAppPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1:getApp", TypeShape.of(GetAppResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified SSL certificate.
     * 
     */
    public static Output<GetAuthorizedCertificateResult> getAuthorizedCertificate(GetAuthorizedCertificateArgs args) {
        return getAuthorizedCertificate(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified SSL certificate.
     * 
     */
    public static CompletableFuture<GetAuthorizedCertificateResult> getAuthorizedCertificatePlain(GetAuthorizedCertificatePlainArgs args) {
        return getAuthorizedCertificatePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified SSL certificate.
     * 
     */
    public static Output<GetAuthorizedCertificateResult> getAuthorizedCertificate(GetAuthorizedCertificateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:appengine/v1:getAuthorizedCertificate", TypeShape.of(GetAuthorizedCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified SSL certificate.
     * 
     */
    public static CompletableFuture<GetAuthorizedCertificateResult> getAuthorizedCertificatePlain(GetAuthorizedCertificatePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1:getAuthorizedCertificate", TypeShape.of(GetAuthorizedCertificateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified domain mapping.
     * 
     */
    public static Output<GetDomainMappingResult> getDomainMapping(GetDomainMappingArgs args) {
        return getDomainMapping(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified domain mapping.
     * 
     */
    public static CompletableFuture<GetDomainMappingResult> getDomainMappingPlain(GetDomainMappingPlainArgs args) {
        return getDomainMappingPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified domain mapping.
     * 
     */
    public static Output<GetDomainMappingResult> getDomainMapping(GetDomainMappingArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:appengine/v1:getDomainMapping", TypeShape.of(GetDomainMappingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified domain mapping.
     * 
     */
    public static CompletableFuture<GetDomainMappingResult> getDomainMappingPlain(GetDomainMappingPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1:getDomainMapping", TypeShape.of(GetDomainMappingResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified firewall rule.
     * 
     */
    public static Output<GetIngressRuleResult> getIngressRule(GetIngressRuleArgs args) {
        return getIngressRule(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified firewall rule.
     * 
     */
    public static CompletableFuture<GetIngressRuleResult> getIngressRulePlain(GetIngressRulePlainArgs args) {
        return getIngressRulePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified firewall rule.
     * 
     */
    public static Output<GetIngressRuleResult> getIngressRule(GetIngressRuleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:appengine/v1:getIngressRule", TypeShape.of(GetIngressRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified firewall rule.
     * 
     */
    public static CompletableFuture<GetIngressRuleResult> getIngressRulePlain(GetIngressRulePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1:getIngressRule", TypeShape.of(GetIngressRuleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
     * 
     */
    public static Output<GetVersionResult> getVersion(GetVersionArgs args) {
        return getVersion(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersionPlain(GetVersionPlainArgs args) {
        return getVersionPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
     * 
     */
    public static Output<GetVersionResult> getVersion(GetVersionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:appengine/v1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the specified Version resource. By default, only a BASIC_VIEW will be returned. Specify the FULL_VIEW parameter to get the full resource.
     * 
     */
    public static CompletableFuture<GetVersionResult> getVersionPlain(GetVersionPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:appengine/v1:getVersion", TypeShape.of(GetVersionResult.class), args, Utilities.withVersion(options));
    }
}
