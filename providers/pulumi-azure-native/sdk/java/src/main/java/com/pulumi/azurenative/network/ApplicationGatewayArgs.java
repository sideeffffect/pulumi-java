// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.ApplicationGatewayAuthenticationCertificateArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayAutoscaleConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayBackendAddressPoolArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayBackendHttpSettingsArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayCustomErrorArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayFrontendIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayFrontendPortArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayHttpListenerArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayIPConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayPrivateLinkConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayProbeArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayRedirectConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayRequestRoutingRuleArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayRewriteRuleSetArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewaySkuArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewaySslCertificateArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewaySslPolicyArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewaySslProfileArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayTrustedClientCertificateArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayTrustedRootCertificateArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayUrlPathMapArgs;
import com.pulumi.azurenative.network.inputs.ApplicationGatewayWebApplicationFirewallConfigurationArgs;
import com.pulumi.azurenative.network.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayArgs Empty = new ApplicationGatewayArgs();

    /**
     * The name of the application gateway.
     * 
     */
    @Import(name="applicationGatewayName")
    private @Nullable Output<String> applicationGatewayName;

    public Optional<Output<String>> applicationGatewayName() {
        return Optional.ofNullable(this.applicationGatewayName);
    }

    /**
     * Authentication certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="authenticationCertificates")
    private @Nullable Output<List<ApplicationGatewayAuthenticationCertificateArgs>> authenticationCertificates;

    public Optional<Output<List<ApplicationGatewayAuthenticationCertificateArgs>>> authenticationCertificates() {
        return Optional.ofNullable(this.authenticationCertificates);
    }

    /**
     * Autoscale Configuration.
     * 
     */
    @Import(name="autoscaleConfiguration")
    private @Nullable Output<ApplicationGatewayAutoscaleConfigurationArgs> autoscaleConfiguration;

    public Optional<Output<ApplicationGatewayAutoscaleConfigurationArgs>> autoscaleConfiguration() {
        return Optional.ofNullable(this.autoscaleConfiguration);
    }

    /**
     * Backend address pool of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="backendAddressPools")
    private @Nullable Output<List<ApplicationGatewayBackendAddressPoolArgs>> backendAddressPools;

    public Optional<Output<List<ApplicationGatewayBackendAddressPoolArgs>>> backendAddressPools() {
        return Optional.ofNullable(this.backendAddressPools);
    }

    /**
     * Backend http settings of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="backendHttpSettingsCollection")
    private @Nullable Output<List<ApplicationGatewayBackendHttpSettingsArgs>> backendHttpSettingsCollection;

    public Optional<Output<List<ApplicationGatewayBackendHttpSettingsArgs>>> backendHttpSettingsCollection() {
        return Optional.ofNullable(this.backendHttpSettingsCollection);
    }

    /**
     * Custom error configurations of the application gateway resource.
     * 
     */
    @Import(name="customErrorConfigurations")
    private @Nullable Output<List<ApplicationGatewayCustomErrorArgs>> customErrorConfigurations;

    public Optional<Output<List<ApplicationGatewayCustomErrorArgs>>> customErrorConfigurations() {
        return Optional.ofNullable(this.customErrorConfigurations);
    }

    /**
     * Whether FIPS is enabled on the application gateway resource.
     * 
     */
    @Import(name="enableFips")
    private @Nullable Output<Boolean> enableFips;

    public Optional<Output<Boolean>> enableFips() {
        return Optional.ofNullable(this.enableFips);
    }

    /**
     * Whether HTTP2 is enabled on the application gateway resource.
     * 
     */
    @Import(name="enableHttp2")
    private @Nullable Output<Boolean> enableHttp2;

    public Optional<Output<Boolean>> enableHttp2() {
        return Optional.ofNullable(this.enableHttp2);
    }

    /**
     * Reference to the FirewallPolicy resource.
     * 
     */
    @Import(name="firewallPolicy")
    private @Nullable Output<SubResourceArgs> firewallPolicy;

    public Optional<Output<SubResourceArgs>> firewallPolicy() {
        return Optional.ofNullable(this.firewallPolicy);
    }

    /**
     * If true, associates a firewall policy with an application gateway regardless whether the policy differs from the WAF Config.
     * 
     */
    @Import(name="forceFirewallPolicyAssociation")
    private @Nullable Output<Boolean> forceFirewallPolicyAssociation;

    public Optional<Output<Boolean>> forceFirewallPolicyAssociation() {
        return Optional.ofNullable(this.forceFirewallPolicyAssociation);
    }

    /**
     * Frontend IP addresses of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="frontendIPConfigurations")
    private @Nullable Output<List<ApplicationGatewayFrontendIPConfigurationArgs>> frontendIPConfigurations;

    public Optional<Output<List<ApplicationGatewayFrontendIPConfigurationArgs>>> frontendIPConfigurations() {
        return Optional.ofNullable(this.frontendIPConfigurations);
    }

    /**
     * Frontend ports of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="frontendPorts")
    private @Nullable Output<List<ApplicationGatewayFrontendPortArgs>> frontendPorts;

    public Optional<Output<List<ApplicationGatewayFrontendPortArgs>>> frontendPorts() {
        return Optional.ofNullable(this.frontendPorts);
    }

    /**
     * Subnets of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="gatewayIPConfigurations")
    private @Nullable Output<List<ApplicationGatewayIPConfigurationArgs>> gatewayIPConfigurations;

    public Optional<Output<List<ApplicationGatewayIPConfigurationArgs>>> gatewayIPConfigurations() {
        return Optional.ofNullable(this.gatewayIPConfigurations);
    }

    /**
     * Http listeners of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="httpListeners")
    private @Nullable Output<List<ApplicationGatewayHttpListenerArgs>> httpListeners;

    public Optional<Output<List<ApplicationGatewayHttpListenerArgs>>> httpListeners() {
        return Optional.ofNullable(this.httpListeners);
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The identity of the application gateway, if configured.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Optional<Output<ManagedServiceIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * PrivateLink configurations on application gateway.
     * 
     */
    @Import(name="privateLinkConfigurations")
    private @Nullable Output<List<ApplicationGatewayPrivateLinkConfigurationArgs>> privateLinkConfigurations;

    public Optional<Output<List<ApplicationGatewayPrivateLinkConfigurationArgs>>> privateLinkConfigurations() {
        return Optional.ofNullable(this.privateLinkConfigurations);
    }

    /**
     * Probes of the application gateway resource.
     * 
     */
    @Import(name="probes")
    private @Nullable Output<List<ApplicationGatewayProbeArgs>> probes;

    public Optional<Output<List<ApplicationGatewayProbeArgs>>> probes() {
        return Optional.ofNullable(this.probes);
    }

    /**
     * Redirect configurations of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="redirectConfigurations")
    private @Nullable Output<List<ApplicationGatewayRedirectConfigurationArgs>> redirectConfigurations;

    public Optional<Output<List<ApplicationGatewayRedirectConfigurationArgs>>> redirectConfigurations() {
        return Optional.ofNullable(this.redirectConfigurations);
    }

    /**
     * Request routing rules of the application gateway resource.
     * 
     */
    @Import(name="requestRoutingRules")
    private @Nullable Output<List<ApplicationGatewayRequestRoutingRuleArgs>> requestRoutingRules;

    public Optional<Output<List<ApplicationGatewayRequestRoutingRuleArgs>>> requestRoutingRules() {
        return Optional.ofNullable(this.requestRoutingRules);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Rewrite rules for the application gateway resource.
     * 
     */
    @Import(name="rewriteRuleSets")
    private @Nullable Output<List<ApplicationGatewayRewriteRuleSetArgs>> rewriteRuleSets;

    public Optional<Output<List<ApplicationGatewayRewriteRuleSetArgs>>> rewriteRuleSets() {
        return Optional.ofNullable(this.rewriteRuleSets);
    }

    /**
     * SKU of the application gateway resource.
     * 
     */
    @Import(name="sku")
    private @Nullable Output<ApplicationGatewaySkuArgs> sku;

    public Optional<Output<ApplicationGatewaySkuArgs>> sku() {
        return Optional.ofNullable(this.sku);
    }

    /**
     * SSL certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="sslCertificates")
    private @Nullable Output<List<ApplicationGatewaySslCertificateArgs>> sslCertificates;

    public Optional<Output<List<ApplicationGatewaySslCertificateArgs>>> sslCertificates() {
        return Optional.ofNullable(this.sslCertificates);
    }

    /**
     * SSL policy of the application gateway resource.
     * 
     */
    @Import(name="sslPolicy")
    private @Nullable Output<ApplicationGatewaySslPolicyArgs> sslPolicy;

    public Optional<Output<ApplicationGatewaySslPolicyArgs>> sslPolicy() {
        return Optional.ofNullable(this.sslPolicy);
    }

    /**
     * SSL profiles of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="sslProfiles")
    private @Nullable Output<List<ApplicationGatewaySslProfileArgs>> sslProfiles;

    public Optional<Output<List<ApplicationGatewaySslProfileArgs>>> sslProfiles() {
        return Optional.ofNullable(this.sslProfiles);
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Trusted client certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="trustedClientCertificates")
    private @Nullable Output<List<ApplicationGatewayTrustedClientCertificateArgs>> trustedClientCertificates;

    public Optional<Output<List<ApplicationGatewayTrustedClientCertificateArgs>>> trustedClientCertificates() {
        return Optional.ofNullable(this.trustedClientCertificates);
    }

    /**
     * Trusted Root certificates of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="trustedRootCertificates")
    private @Nullable Output<List<ApplicationGatewayTrustedRootCertificateArgs>> trustedRootCertificates;

    public Optional<Output<List<ApplicationGatewayTrustedRootCertificateArgs>>> trustedRootCertificates() {
        return Optional.ofNullable(this.trustedRootCertificates);
    }

    /**
     * URL path map of the application gateway resource. For default limits, see [Application Gateway limits](https://docs.microsoft.com/azure/azure-subscription-service-limits#application-gateway-limits).
     * 
     */
    @Import(name="urlPathMaps")
    private @Nullable Output<List<ApplicationGatewayUrlPathMapArgs>> urlPathMaps;

    public Optional<Output<List<ApplicationGatewayUrlPathMapArgs>>> urlPathMaps() {
        return Optional.ofNullable(this.urlPathMaps);
    }

    /**
     * Web application firewall configuration.
     * 
     */
    @Import(name="webApplicationFirewallConfiguration")
    private @Nullable Output<ApplicationGatewayWebApplicationFirewallConfigurationArgs> webApplicationFirewallConfiguration;

    public Optional<Output<ApplicationGatewayWebApplicationFirewallConfigurationArgs>> webApplicationFirewallConfiguration() {
        return Optional.ofNullable(this.webApplicationFirewallConfiguration);
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @Import(name="zones")
    private @Nullable Output<List<String>> zones;

    public Optional<Output<List<String>>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private ApplicationGatewayArgs() {}

    private ApplicationGatewayArgs(ApplicationGatewayArgs $) {
        this.applicationGatewayName = $.applicationGatewayName;
        this.authenticationCertificates = $.authenticationCertificates;
        this.autoscaleConfiguration = $.autoscaleConfiguration;
        this.backendAddressPools = $.backendAddressPools;
        this.backendHttpSettingsCollection = $.backendHttpSettingsCollection;
        this.customErrorConfigurations = $.customErrorConfigurations;
        this.enableFips = $.enableFips;
        this.enableHttp2 = $.enableHttp2;
        this.firewallPolicy = $.firewallPolicy;
        this.forceFirewallPolicyAssociation = $.forceFirewallPolicyAssociation;
        this.frontendIPConfigurations = $.frontendIPConfigurations;
        this.frontendPorts = $.frontendPorts;
        this.gatewayIPConfigurations = $.gatewayIPConfigurations;
        this.httpListeners = $.httpListeners;
        this.id = $.id;
        this.identity = $.identity;
        this.location = $.location;
        this.privateLinkConfigurations = $.privateLinkConfigurations;
        this.probes = $.probes;
        this.redirectConfigurations = $.redirectConfigurations;
        this.requestRoutingRules = $.requestRoutingRules;
        this.resourceGroupName = $.resourceGroupName;
        this.rewriteRuleSets = $.rewriteRuleSets;
        this.sku = $.sku;
        this.sslCertificates = $.sslCertificates;
        this.sslPolicy = $.sslPolicy;
        this.sslProfiles = $.sslProfiles;
        this.tags = $.tags;
        this.trustedClientCertificates = $.trustedClientCertificates;
        this.trustedRootCertificates = $.trustedRootCertificates;
        this.urlPathMaps = $.urlPathMaps;
        this.webApplicationFirewallConfiguration = $.webApplicationFirewallConfiguration;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayArgs $;

        public Builder() {
            $ = new ApplicationGatewayArgs();
        }

        public Builder(ApplicationGatewayArgs defaults) {
            $ = new ApplicationGatewayArgs(Objects.requireNonNull(defaults));
        }

        public Builder applicationGatewayName(@Nullable Output<String> applicationGatewayName) {
            $.applicationGatewayName = applicationGatewayName;
            return this;
        }

        public Builder applicationGatewayName(String applicationGatewayName) {
            return applicationGatewayName(Output.of(applicationGatewayName));
        }

        public Builder authenticationCertificates(@Nullable Output<List<ApplicationGatewayAuthenticationCertificateArgs>> authenticationCertificates) {
            $.authenticationCertificates = authenticationCertificates;
            return this;
        }

        public Builder authenticationCertificates(List<ApplicationGatewayAuthenticationCertificateArgs> authenticationCertificates) {
            return authenticationCertificates(Output.of(authenticationCertificates));
        }

        public Builder authenticationCertificates(ApplicationGatewayAuthenticationCertificateArgs... authenticationCertificates) {
            return authenticationCertificates(List.of(authenticationCertificates));
        }

        public Builder autoscaleConfiguration(@Nullable Output<ApplicationGatewayAutoscaleConfigurationArgs> autoscaleConfiguration) {
            $.autoscaleConfiguration = autoscaleConfiguration;
            return this;
        }

        public Builder autoscaleConfiguration(ApplicationGatewayAutoscaleConfigurationArgs autoscaleConfiguration) {
            return autoscaleConfiguration(Output.of(autoscaleConfiguration));
        }

        public Builder backendAddressPools(@Nullable Output<List<ApplicationGatewayBackendAddressPoolArgs>> backendAddressPools) {
            $.backendAddressPools = backendAddressPools;
            return this;
        }

        public Builder backendAddressPools(List<ApplicationGatewayBackendAddressPoolArgs> backendAddressPools) {
            return backendAddressPools(Output.of(backendAddressPools));
        }

        public Builder backendAddressPools(ApplicationGatewayBackendAddressPoolArgs... backendAddressPools) {
            return backendAddressPools(List.of(backendAddressPools));
        }

        public Builder backendHttpSettingsCollection(@Nullable Output<List<ApplicationGatewayBackendHttpSettingsArgs>> backendHttpSettingsCollection) {
            $.backendHttpSettingsCollection = backendHttpSettingsCollection;
            return this;
        }

        public Builder backendHttpSettingsCollection(List<ApplicationGatewayBackendHttpSettingsArgs> backendHttpSettingsCollection) {
            return backendHttpSettingsCollection(Output.of(backendHttpSettingsCollection));
        }

        public Builder backendHttpSettingsCollection(ApplicationGatewayBackendHttpSettingsArgs... backendHttpSettingsCollection) {
            return backendHttpSettingsCollection(List.of(backendHttpSettingsCollection));
        }

        public Builder customErrorConfigurations(@Nullable Output<List<ApplicationGatewayCustomErrorArgs>> customErrorConfigurations) {
            $.customErrorConfigurations = customErrorConfigurations;
            return this;
        }

        public Builder customErrorConfigurations(List<ApplicationGatewayCustomErrorArgs> customErrorConfigurations) {
            return customErrorConfigurations(Output.of(customErrorConfigurations));
        }

        public Builder customErrorConfigurations(ApplicationGatewayCustomErrorArgs... customErrorConfigurations) {
            return customErrorConfigurations(List.of(customErrorConfigurations));
        }

        public Builder enableFips(@Nullable Output<Boolean> enableFips) {
            $.enableFips = enableFips;
            return this;
        }

        public Builder enableFips(Boolean enableFips) {
            return enableFips(Output.of(enableFips));
        }

        public Builder enableHttp2(@Nullable Output<Boolean> enableHttp2) {
            $.enableHttp2 = enableHttp2;
            return this;
        }

        public Builder enableHttp2(Boolean enableHttp2) {
            return enableHttp2(Output.of(enableHttp2));
        }

        public Builder firewallPolicy(@Nullable Output<SubResourceArgs> firewallPolicy) {
            $.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder firewallPolicy(SubResourceArgs firewallPolicy) {
            return firewallPolicy(Output.of(firewallPolicy));
        }

        public Builder forceFirewallPolicyAssociation(@Nullable Output<Boolean> forceFirewallPolicyAssociation) {
            $.forceFirewallPolicyAssociation = forceFirewallPolicyAssociation;
            return this;
        }

        public Builder forceFirewallPolicyAssociation(Boolean forceFirewallPolicyAssociation) {
            return forceFirewallPolicyAssociation(Output.of(forceFirewallPolicyAssociation));
        }

        public Builder frontendIPConfigurations(@Nullable Output<List<ApplicationGatewayFrontendIPConfigurationArgs>> frontendIPConfigurations) {
            $.frontendIPConfigurations = frontendIPConfigurations;
            return this;
        }

        public Builder frontendIPConfigurations(List<ApplicationGatewayFrontendIPConfigurationArgs> frontendIPConfigurations) {
            return frontendIPConfigurations(Output.of(frontendIPConfigurations));
        }

        public Builder frontendIPConfigurations(ApplicationGatewayFrontendIPConfigurationArgs... frontendIPConfigurations) {
            return frontendIPConfigurations(List.of(frontendIPConfigurations));
        }

        public Builder frontendPorts(@Nullable Output<List<ApplicationGatewayFrontendPortArgs>> frontendPorts) {
            $.frontendPorts = frontendPorts;
            return this;
        }

        public Builder frontendPorts(List<ApplicationGatewayFrontendPortArgs> frontendPorts) {
            return frontendPorts(Output.of(frontendPorts));
        }

        public Builder frontendPorts(ApplicationGatewayFrontendPortArgs... frontendPorts) {
            return frontendPorts(List.of(frontendPorts));
        }

        public Builder gatewayIPConfigurations(@Nullable Output<List<ApplicationGatewayIPConfigurationArgs>> gatewayIPConfigurations) {
            $.gatewayIPConfigurations = gatewayIPConfigurations;
            return this;
        }

        public Builder gatewayIPConfigurations(List<ApplicationGatewayIPConfigurationArgs> gatewayIPConfigurations) {
            return gatewayIPConfigurations(Output.of(gatewayIPConfigurations));
        }

        public Builder gatewayIPConfigurations(ApplicationGatewayIPConfigurationArgs... gatewayIPConfigurations) {
            return gatewayIPConfigurations(List.of(gatewayIPConfigurations));
        }

        public Builder httpListeners(@Nullable Output<List<ApplicationGatewayHttpListenerArgs>> httpListeners) {
            $.httpListeners = httpListeners;
            return this;
        }

        public Builder httpListeners(List<ApplicationGatewayHttpListenerArgs> httpListeners) {
            return httpListeners(Output.of(httpListeners));
        }

        public Builder httpListeners(ApplicationGatewayHttpListenerArgs... httpListeners) {
            return httpListeners(List.of(httpListeners));
        }

        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        public Builder id(String id) {
            return id(Output.of(id));
        }

        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        public Builder identity(ManagedServiceIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder privateLinkConfigurations(@Nullable Output<List<ApplicationGatewayPrivateLinkConfigurationArgs>> privateLinkConfigurations) {
            $.privateLinkConfigurations = privateLinkConfigurations;
            return this;
        }

        public Builder privateLinkConfigurations(List<ApplicationGatewayPrivateLinkConfigurationArgs> privateLinkConfigurations) {
            return privateLinkConfigurations(Output.of(privateLinkConfigurations));
        }

        public Builder privateLinkConfigurations(ApplicationGatewayPrivateLinkConfigurationArgs... privateLinkConfigurations) {
            return privateLinkConfigurations(List.of(privateLinkConfigurations));
        }

        public Builder probes(@Nullable Output<List<ApplicationGatewayProbeArgs>> probes) {
            $.probes = probes;
            return this;
        }

        public Builder probes(List<ApplicationGatewayProbeArgs> probes) {
            return probes(Output.of(probes));
        }

        public Builder probes(ApplicationGatewayProbeArgs... probes) {
            return probes(List.of(probes));
        }

        public Builder redirectConfigurations(@Nullable Output<List<ApplicationGatewayRedirectConfigurationArgs>> redirectConfigurations) {
            $.redirectConfigurations = redirectConfigurations;
            return this;
        }

        public Builder redirectConfigurations(List<ApplicationGatewayRedirectConfigurationArgs> redirectConfigurations) {
            return redirectConfigurations(Output.of(redirectConfigurations));
        }

        public Builder redirectConfigurations(ApplicationGatewayRedirectConfigurationArgs... redirectConfigurations) {
            return redirectConfigurations(List.of(redirectConfigurations));
        }

        public Builder requestRoutingRules(@Nullable Output<List<ApplicationGatewayRequestRoutingRuleArgs>> requestRoutingRules) {
            $.requestRoutingRules = requestRoutingRules;
            return this;
        }

        public Builder requestRoutingRules(List<ApplicationGatewayRequestRoutingRuleArgs> requestRoutingRules) {
            return requestRoutingRules(Output.of(requestRoutingRules));
        }

        public Builder requestRoutingRules(ApplicationGatewayRequestRoutingRuleArgs... requestRoutingRules) {
            return requestRoutingRules(List.of(requestRoutingRules));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder rewriteRuleSets(@Nullable Output<List<ApplicationGatewayRewriteRuleSetArgs>> rewriteRuleSets) {
            $.rewriteRuleSets = rewriteRuleSets;
            return this;
        }

        public Builder rewriteRuleSets(List<ApplicationGatewayRewriteRuleSetArgs> rewriteRuleSets) {
            return rewriteRuleSets(Output.of(rewriteRuleSets));
        }

        public Builder rewriteRuleSets(ApplicationGatewayRewriteRuleSetArgs... rewriteRuleSets) {
            return rewriteRuleSets(List.of(rewriteRuleSets));
        }

        public Builder sku(@Nullable Output<ApplicationGatewaySkuArgs> sku) {
            $.sku = sku;
            return this;
        }

        public Builder sku(ApplicationGatewaySkuArgs sku) {
            return sku(Output.of(sku));
        }

        public Builder sslCertificates(@Nullable Output<List<ApplicationGatewaySslCertificateArgs>> sslCertificates) {
            $.sslCertificates = sslCertificates;
            return this;
        }

        public Builder sslCertificates(List<ApplicationGatewaySslCertificateArgs> sslCertificates) {
            return sslCertificates(Output.of(sslCertificates));
        }

        public Builder sslCertificates(ApplicationGatewaySslCertificateArgs... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }

        public Builder sslPolicy(@Nullable Output<ApplicationGatewaySslPolicyArgs> sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        public Builder sslPolicy(ApplicationGatewaySslPolicyArgs sslPolicy) {
            return sslPolicy(Output.of(sslPolicy));
        }

        public Builder sslProfiles(@Nullable Output<List<ApplicationGatewaySslProfileArgs>> sslProfiles) {
            $.sslProfiles = sslProfiles;
            return this;
        }

        public Builder sslProfiles(List<ApplicationGatewaySslProfileArgs> sslProfiles) {
            return sslProfiles(Output.of(sslProfiles));
        }

        public Builder sslProfiles(ApplicationGatewaySslProfileArgs... sslProfiles) {
            return sslProfiles(List.of(sslProfiles));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder trustedClientCertificates(@Nullable Output<List<ApplicationGatewayTrustedClientCertificateArgs>> trustedClientCertificates) {
            $.trustedClientCertificates = trustedClientCertificates;
            return this;
        }

        public Builder trustedClientCertificates(List<ApplicationGatewayTrustedClientCertificateArgs> trustedClientCertificates) {
            return trustedClientCertificates(Output.of(trustedClientCertificates));
        }

        public Builder trustedClientCertificates(ApplicationGatewayTrustedClientCertificateArgs... trustedClientCertificates) {
            return trustedClientCertificates(List.of(trustedClientCertificates));
        }

        public Builder trustedRootCertificates(@Nullable Output<List<ApplicationGatewayTrustedRootCertificateArgs>> trustedRootCertificates) {
            $.trustedRootCertificates = trustedRootCertificates;
            return this;
        }

        public Builder trustedRootCertificates(List<ApplicationGatewayTrustedRootCertificateArgs> trustedRootCertificates) {
            return trustedRootCertificates(Output.of(trustedRootCertificates));
        }

        public Builder trustedRootCertificates(ApplicationGatewayTrustedRootCertificateArgs... trustedRootCertificates) {
            return trustedRootCertificates(List.of(trustedRootCertificates));
        }

        public Builder urlPathMaps(@Nullable Output<List<ApplicationGatewayUrlPathMapArgs>> urlPathMaps) {
            $.urlPathMaps = urlPathMaps;
            return this;
        }

        public Builder urlPathMaps(List<ApplicationGatewayUrlPathMapArgs> urlPathMaps) {
            return urlPathMaps(Output.of(urlPathMaps));
        }

        public Builder urlPathMaps(ApplicationGatewayUrlPathMapArgs... urlPathMaps) {
            return urlPathMaps(List.of(urlPathMaps));
        }

        public Builder webApplicationFirewallConfiguration(@Nullable Output<ApplicationGatewayWebApplicationFirewallConfigurationArgs> webApplicationFirewallConfiguration) {
            $.webApplicationFirewallConfiguration = webApplicationFirewallConfiguration;
            return this;
        }

        public Builder webApplicationFirewallConfiguration(ApplicationGatewayWebApplicationFirewallConfigurationArgs webApplicationFirewallConfiguration) {
            return webApplicationFirewallConfiguration(Output.of(webApplicationFirewallConfiguration));
        }

        public Builder zones(@Nullable Output<List<String>> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(List<String> zones) {
            return zones(Output.of(zones));
        }

        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public ApplicationGatewayArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
