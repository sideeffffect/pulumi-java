// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolIssuancePolicyArgs;
import io.pulumi.gcp.certificateauthority.inputs.CaPoolPublishingOptionsArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CaPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final CaPoolArgs Empty = new CaPoolArgs();

    /**
     * The IssuancePolicy to control how Certificates will be issued from this CaPool.
     * Structure is documented below.
     * 
     */
    @Import(name="issuancePolicy")
      private final @Nullable Output<CaPoolIssuancePolicyArgs> issuancePolicy;

    public Output<CaPoolIssuancePolicyArgs> issuancePolicy() {
        return this.issuancePolicy == null ? Codegen.empty() : this.issuancePolicy;
    }

    /**
     * Labels with user-defined metadata.
     * An object containing a list of "key": value pairs. Example: { "name": "wrench", "mass":
     * "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * String indicating the location of the expression for error reporting, e.g. a file name and a position in the file.
     * 
     */
    @Import(name="location", required=true)
      private final Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    /**
     * The name for this CaPool.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The PublishingOptions to follow when issuing Certificates from any CertificateAuthority in this CaPool.
     * Structure is documented below.
     * 
     */
    @Import(name="publishingOptions")
      private final @Nullable Output<CaPoolPublishingOptionsArgs> publishingOptions;

    public Output<CaPoolPublishingOptionsArgs> publishingOptions() {
        return this.publishingOptions == null ? Codegen.empty() : this.publishingOptions;
    }

    /**
     * The Tier of this CaPool.
     * Possible values are `ENTERPRISE` and `DEVOPS`.
     * 
     */
    @Import(name="tier", required=true)
      private final Output<String> tier;

    public Output<String> tier() {
        return this.tier;
    }

    public CaPoolArgs(
        @Nullable Output<CaPoolIssuancePolicyArgs> issuancePolicy,
        @Nullable Output<Map<String,String>> labels,
        Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<CaPoolPublishingOptionsArgs> publishingOptions,
        Output<String> tier) {
        this.issuancePolicy = issuancePolicy;
        this.labels = labels;
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.name = name;
        this.project = project;
        this.publishingOptions = publishingOptions;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
    }

    private CaPoolArgs() {
        this.issuancePolicy = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.publishingOptions = Codegen.empty();
        this.tier = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CaPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<CaPoolIssuancePolicyArgs> issuancePolicy;
        private @Nullable Output<Map<String,String>> labels;
        private Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<CaPoolPublishingOptionsArgs> publishingOptions;
        private Output<String> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(CaPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.issuancePolicy = defaults.issuancePolicy;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publishingOptions = defaults.publishingOptions;
    	      this.tier = defaults.tier;
        }

        public Builder issuancePolicy(@Nullable Output<CaPoolIssuancePolicyArgs> issuancePolicy) {
            this.issuancePolicy = issuancePolicy;
            return this;
        }
        public Builder issuancePolicy(@Nullable CaPoolIssuancePolicyArgs issuancePolicy) {
            this.issuancePolicy = Codegen.ofNullable(issuancePolicy);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(Output<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder location(String location) {
            this.location = Output.of(Objects.requireNonNull(location));
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder publishingOptions(@Nullable Output<CaPoolPublishingOptionsArgs> publishingOptions) {
            this.publishingOptions = publishingOptions;
            return this;
        }
        public Builder publishingOptions(@Nullable CaPoolPublishingOptionsArgs publishingOptions) {
            this.publishingOptions = Codegen.ofNullable(publishingOptions);
            return this;
        }
        public Builder tier(Output<String> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }
        public Builder tier(String tier) {
            this.tier = Output.of(Objects.requireNonNull(tier));
            return this;
        }        public CaPoolArgs build() {
            return new CaPoolArgs(issuancePolicy, labels, location, name, project, publishingOptions, tier);
        }
    }
}
