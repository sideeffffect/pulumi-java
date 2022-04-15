// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink.inputs;

import io.pulumi.aws.worklink.inputs.FleetIdentityProviderGetArgs;
import io.pulumi.aws.worklink.inputs.FleetNetworkGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FleetState extends io.pulumi.resources.ResourceArgs {

    public static final FleetState Empty = new FleetState();

    /**
     * The ARN of the created WorkLink Fleet.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The ARN of the Amazon Kinesis data stream that receives the audit events. Kinesis data stream name must begin with `"AmazonWorkLink-"`.
     * 
     */
    @Import(name="auditStreamArn")
      private final @Nullable Output<String> auditStreamArn;

    public Output<String> auditStreamArn() {
        return this.auditStreamArn == null ? Codegen.empty() : this.auditStreamArn;
    }

    /**
     * The identifier used by users to sign in to the Amazon WorkLink app.
     * 
     */
    @Import(name="companyCode")
      private final @Nullable Output<String> companyCode;

    public Output<String> companyCode() {
        return this.companyCode == null ? Codegen.empty() : this.companyCode;
    }

    /**
     * The time that the fleet was created.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> createdTime() {
        return this.createdTime == null ? Codegen.empty() : this.createdTime;
    }

    /**
     * The certificate chain, including intermediate certificates and the root certificate authority certificate used to issue device certificates.
     * 
     */
    @Import(name="deviceCaCertificate")
      private final @Nullable Output<String> deviceCaCertificate;

    public Output<String> deviceCaCertificate() {
        return this.deviceCaCertificate == null ? Codegen.empty() : this.deviceCaCertificate;
    }

    /**
     * The name of the fleet.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * Provide this to allow manage the identity provider configuration for the fleet. Fields documented below.
     * 
     */
    @Import(name="identityProvider")
      private final @Nullable Output<FleetIdentityProviderGetArgs> identityProvider;

    public Output<FleetIdentityProviderGetArgs> identityProvider() {
        return this.identityProvider == null ? Codegen.empty() : this.identityProvider;
    }

    /**
     * The time that the fleet was last updated.
     * 
     */
    @Import(name="lastUpdatedTime")
      private final @Nullable Output<String> lastUpdatedTime;

    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime == null ? Codegen.empty() : this.lastUpdatedTime;
    }

    /**
     * A region-unique name for the AMI.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Provide this to allow manage the company network configuration for the fleet. Fields documented below.
     * 
     */
    @Import(name="network")
      private final @Nullable Output<FleetNetworkGetArgs> network;

    public Output<FleetNetworkGetArgs> network() {
        return this.network == null ? Codegen.empty() : this.network;
    }

    /**
     * The option to optimize for better performance by routing traffic through the closest AWS Region to users, which may be outside of your home Region. Defaults to `true`.
     * 
     */
    @Import(name="optimizeForEndUserLocation")
      private final @Nullable Output<Boolean> optimizeForEndUserLocation;

    public Output<Boolean> optimizeForEndUserLocation() {
        return this.optimizeForEndUserLocation == null ? Codegen.empty() : this.optimizeForEndUserLocation;
    }

    public FleetState(
        @Nullable Output<String> arn,
        @Nullable Output<String> auditStreamArn,
        @Nullable Output<String> companyCode,
        @Nullable Output<String> createdTime,
        @Nullable Output<String> deviceCaCertificate,
        @Nullable Output<String> displayName,
        @Nullable Output<FleetIdentityProviderGetArgs> identityProvider,
        @Nullable Output<String> lastUpdatedTime,
        @Nullable Output<String> name,
        @Nullable Output<FleetNetworkGetArgs> network,
        @Nullable Output<Boolean> optimizeForEndUserLocation) {
        this.arn = arn;
        this.auditStreamArn = auditStreamArn;
        this.companyCode = companyCode;
        this.createdTime = createdTime;
        this.deviceCaCertificate = deviceCaCertificate;
        this.displayName = displayName;
        this.identityProvider = identityProvider;
        this.lastUpdatedTime = lastUpdatedTime;
        this.name = name;
        this.network = network;
        this.optimizeForEndUserLocation = optimizeForEndUserLocation;
    }

    private FleetState() {
        this.arn = Codegen.empty();
        this.auditStreamArn = Codegen.empty();
        this.companyCode = Codegen.empty();
        this.createdTime = Codegen.empty();
        this.deviceCaCertificate = Codegen.empty();
        this.displayName = Codegen.empty();
        this.identityProvider = Codegen.empty();
        this.lastUpdatedTime = Codegen.empty();
        this.name = Codegen.empty();
        this.network = Codegen.empty();
        this.optimizeForEndUserLocation = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FleetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> auditStreamArn;
        private @Nullable Output<String> companyCode;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<String> deviceCaCertificate;
        private @Nullable Output<String> displayName;
        private @Nullable Output<FleetIdentityProviderGetArgs> identityProvider;
        private @Nullable Output<String> lastUpdatedTime;
        private @Nullable Output<String> name;
        private @Nullable Output<FleetNetworkGetArgs> network;
        private @Nullable Output<Boolean> optimizeForEndUserLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(FleetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auditStreamArn = defaults.auditStreamArn;
    	      this.companyCode = defaults.companyCode;
    	      this.createdTime = defaults.createdTime;
    	      this.deviceCaCertificate = defaults.deviceCaCertificate;
    	      this.displayName = defaults.displayName;
    	      this.identityProvider = defaults.identityProvider;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.optimizeForEndUserLocation = defaults.optimizeForEndUserLocation;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder auditStreamArn(@Nullable Output<String> auditStreamArn) {
            this.auditStreamArn = auditStreamArn;
            return this;
        }
        public Builder auditStreamArn(@Nullable String auditStreamArn) {
            this.auditStreamArn = Codegen.ofNullable(auditStreamArn);
            return this;
        }
        public Builder companyCode(@Nullable Output<String> companyCode) {
            this.companyCode = companyCode;
            return this;
        }
        public Builder companyCode(@Nullable String companyCode) {
            this.companyCode = Codegen.ofNullable(companyCode);
            return this;
        }
        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Codegen.ofNullable(createdTime);
            return this;
        }
        public Builder deviceCaCertificate(@Nullable Output<String> deviceCaCertificate) {
            this.deviceCaCertificate = deviceCaCertificate;
            return this;
        }
        public Builder deviceCaCertificate(@Nullable String deviceCaCertificate) {
            this.deviceCaCertificate = Codegen.ofNullable(deviceCaCertificate);
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder identityProvider(@Nullable Output<FleetIdentityProviderGetArgs> identityProvider) {
            this.identityProvider = identityProvider;
            return this;
        }
        public Builder identityProvider(@Nullable FleetIdentityProviderGetArgs identityProvider) {
            this.identityProvider = Codegen.ofNullable(identityProvider);
            return this;
        }
        public Builder lastUpdatedTime(@Nullable Output<String> lastUpdatedTime) {
            this.lastUpdatedTime = lastUpdatedTime;
            return this;
        }
        public Builder lastUpdatedTime(@Nullable String lastUpdatedTime) {
            this.lastUpdatedTime = Codegen.ofNullable(lastUpdatedTime);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder network(@Nullable Output<FleetNetworkGetArgs> network) {
            this.network = network;
            return this;
        }
        public Builder network(@Nullable FleetNetworkGetArgs network) {
            this.network = Codegen.ofNullable(network);
            return this;
        }
        public Builder optimizeForEndUserLocation(@Nullable Output<Boolean> optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = optimizeForEndUserLocation;
            return this;
        }
        public Builder optimizeForEndUserLocation(@Nullable Boolean optimizeForEndUserLocation) {
            this.optimizeForEndUserLocation = Codegen.ofNullable(optimizeForEndUserLocation);
            return this;
        }        public FleetState build() {
            return new FleetState(arn, auditStreamArn, companyCode, createdTime, deviceCaCertificate, displayName, identityProvider, lastUpdatedTime, name, network, optimizeForEndUserLocation);
        }
    }
}
