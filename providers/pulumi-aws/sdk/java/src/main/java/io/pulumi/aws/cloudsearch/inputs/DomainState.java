// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudsearch.inputs;

import io.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsGetArgs;
import io.pulumi.aws.cloudsearch.inputs.DomainIndexFieldGetArgs;
import io.pulumi.aws.cloudsearch.inputs.DomainScalingParametersGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends io.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The domain's ARN.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The service endpoint for updating documents in a search domain.
     * 
     */
    @Import(name="documentServiceEndpoint")
      private final @Nullable Output<String> documentServiceEndpoint;

    public Output<String> documentServiceEndpoint() {
        return this.documentServiceEndpoint == null ? Codegen.empty() : this.documentServiceEndpoint;
    }

    /**
     * An internally generated unique identifier for the domain.
     * 
     */
    @Import(name="domainId")
      private final @Nullable Output<String> domainId;

    public Output<String> domainId() {
        return this.domainId == null ? Codegen.empty() : this.domainId;
    }

    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Import(name="endpointOptions")
      private final @Nullable Output<DomainEndpointOptionsGetArgs> endpointOptions;

    public Output<DomainEndpointOptionsGetArgs> endpointOptions() {
        return this.endpointOptions == null ? Codegen.empty() : this.endpointOptions;
    }

    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Import(name="indexFields")
      private final @Nullable Output<List<DomainIndexFieldGetArgs>> indexFields;

    public Output<List<DomainIndexFieldGetArgs>> indexFields() {
        return this.indexFields == null ? Codegen.empty() : this.indexFields;
    }

    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Import(name="multiAz")
      private final @Nullable Output<Boolean> multiAz;

    public Output<Boolean> multiAz() {
        return this.multiAz == null ? Codegen.empty() : this.multiAz;
    }

    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Import(name="scalingParameters")
      private final @Nullable Output<DomainScalingParametersGetArgs> scalingParameters;

    public Output<DomainScalingParametersGetArgs> scalingParameters() {
        return this.scalingParameters == null ? Codegen.empty() : this.scalingParameters;
    }

    /**
     * The service endpoint for requesting search results from a search domain.
     * 
     */
    @Import(name="searchServiceEndpoint")
      private final @Nullable Output<String> searchServiceEndpoint;

    public Output<String> searchServiceEndpoint() {
        return this.searchServiceEndpoint == null ? Codegen.empty() : this.searchServiceEndpoint;
    }

    public DomainState(
        @Nullable Output<String> arn,
        @Nullable Output<String> documentServiceEndpoint,
        @Nullable Output<String> domainId,
        @Nullable Output<DomainEndpointOptionsGetArgs> endpointOptions,
        @Nullable Output<List<DomainIndexFieldGetArgs>> indexFields,
        @Nullable Output<Boolean> multiAz,
        @Nullable Output<String> name,
        @Nullable Output<DomainScalingParametersGetArgs> scalingParameters,
        @Nullable Output<String> searchServiceEndpoint) {
        this.arn = arn;
        this.documentServiceEndpoint = documentServiceEndpoint;
        this.domainId = domainId;
        this.endpointOptions = endpointOptions;
        this.indexFields = indexFields;
        this.multiAz = multiAz;
        this.name = name;
        this.scalingParameters = scalingParameters;
        this.searchServiceEndpoint = searchServiceEndpoint;
    }

    private DomainState() {
        this.arn = Codegen.empty();
        this.documentServiceEndpoint = Codegen.empty();
        this.domainId = Codegen.empty();
        this.endpointOptions = Codegen.empty();
        this.indexFields = Codegen.empty();
        this.multiAz = Codegen.empty();
        this.name = Codegen.empty();
        this.scalingParameters = Codegen.empty();
        this.searchServiceEndpoint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> documentServiceEndpoint;
        private @Nullable Output<String> domainId;
        private @Nullable Output<DomainEndpointOptionsGetArgs> endpointOptions;
        private @Nullable Output<List<DomainIndexFieldGetArgs>> indexFields;
        private @Nullable Output<Boolean> multiAz;
        private @Nullable Output<String> name;
        private @Nullable Output<DomainScalingParametersGetArgs> scalingParameters;
        private @Nullable Output<String> searchServiceEndpoint;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.documentServiceEndpoint = defaults.documentServiceEndpoint;
    	      this.domainId = defaults.domainId;
    	      this.endpointOptions = defaults.endpointOptions;
    	      this.indexFields = defaults.indexFields;
    	      this.multiAz = defaults.multiAz;
    	      this.name = defaults.name;
    	      this.scalingParameters = defaults.scalingParameters;
    	      this.searchServiceEndpoint = defaults.searchServiceEndpoint;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder documentServiceEndpoint(@Nullable Output<String> documentServiceEndpoint) {
            this.documentServiceEndpoint = documentServiceEndpoint;
            return this;
        }
        public Builder documentServiceEndpoint(@Nullable String documentServiceEndpoint) {
            this.documentServiceEndpoint = Codegen.ofNullable(documentServiceEndpoint);
            return this;
        }
        public Builder domainId(@Nullable Output<String> domainId) {
            this.domainId = domainId;
            return this;
        }
        public Builder domainId(@Nullable String domainId) {
            this.domainId = Codegen.ofNullable(domainId);
            return this;
        }
        public Builder endpointOptions(@Nullable Output<DomainEndpointOptionsGetArgs> endpointOptions) {
            this.endpointOptions = endpointOptions;
            return this;
        }
        public Builder endpointOptions(@Nullable DomainEndpointOptionsGetArgs endpointOptions) {
            this.endpointOptions = Codegen.ofNullable(endpointOptions);
            return this;
        }
        public Builder indexFields(@Nullable Output<List<DomainIndexFieldGetArgs>> indexFields) {
            this.indexFields = indexFields;
            return this;
        }
        public Builder indexFields(@Nullable List<DomainIndexFieldGetArgs> indexFields) {
            this.indexFields = Codegen.ofNullable(indexFields);
            return this;
        }
        public Builder indexFields(DomainIndexFieldGetArgs... indexFields) {
            return indexFields(List.of(indexFields));
        }
        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            this.multiAz = multiAz;
            return this;
        }
        public Builder multiAz(@Nullable Boolean multiAz) {
            this.multiAz = Codegen.ofNullable(multiAz);
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
        public Builder scalingParameters(@Nullable Output<DomainScalingParametersGetArgs> scalingParameters) {
            this.scalingParameters = scalingParameters;
            return this;
        }
        public Builder scalingParameters(@Nullable DomainScalingParametersGetArgs scalingParameters) {
            this.scalingParameters = Codegen.ofNullable(scalingParameters);
            return this;
        }
        public Builder searchServiceEndpoint(@Nullable Output<String> searchServiceEndpoint) {
            this.searchServiceEndpoint = searchServiceEndpoint;
            return this;
        }
        public Builder searchServiceEndpoint(@Nullable String searchServiceEndpoint) {
            this.searchServiceEndpoint = Codegen.ofNullable(searchServiceEndpoint);
            return this;
        }        public DomainState build() {
            return new DomainState(arn, documentServiceEndpoint, domainId, endpointOptions, indexFields, multiAz, name, scalingParameters, searchServiceEndpoint);
        }
    }
}
