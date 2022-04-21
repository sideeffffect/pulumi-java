// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudsearch.inputs;

import com.pulumi.aws.cloudsearch.inputs.DomainEndpointOptionsGetArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainIndexFieldGetArgs;
import com.pulumi.aws.cloudsearch.inputs.DomainScalingParametersGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The domain&#39;s ARN.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * The service endpoint for updating documents in a search domain.
     * 
     */
    @Import(name="documentServiceEndpoint")
    private @Nullable Output<String> documentServiceEndpoint;

    public Optional<Output<String>> documentServiceEndpoint() {
        return Optional.ofNullable(this.documentServiceEndpoint);
    }

    /**
     * An internally generated unique identifier for the domain.
     * 
     */
    @Import(name="domainId")
    private @Nullable Output<String> domainId;

    public Optional<Output<String>> domainId() {
        return Optional.ofNullable(this.domainId);
    }

    /**
     * Domain endpoint options. Documented below.
     * 
     */
    @Import(name="endpointOptions")
    private @Nullable Output<DomainEndpointOptionsGetArgs> endpointOptions;

    public Optional<Output<DomainEndpointOptionsGetArgs>> endpointOptions() {
        return Optional.ofNullable(this.endpointOptions);
    }

    /**
     * The index fields for documents added to the domain. Documented below.
     * 
     */
    @Import(name="indexFields")
    private @Nullable Output<List<DomainIndexFieldGetArgs>> indexFields;

    public Optional<Output<List<DomainIndexFieldGetArgs>>> indexFields() {
        return Optional.ofNullable(this.indexFields);
    }

    /**
     * Whether or not to maintain extra instances for the domain in a second Availability Zone to ensure high availability.
     * 
     */
    @Import(name="multiAz")
    private @Nullable Output<Boolean> multiAz;

    public Optional<Output<Boolean>> multiAz() {
        return Optional.ofNullable(this.multiAz);
    }

    /**
     * A unique name for the field. Field names must begin with a letter and be at least 3 and no more than 64 characters long. The allowed characters are: `a`-`z` (lower-case letters), `0`-`9`, and `_` (underscore). The name `score` is reserved and cannot be used as a field name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Domain scaling parameters. Documented below.
     * 
     */
    @Import(name="scalingParameters")
    private @Nullable Output<DomainScalingParametersGetArgs> scalingParameters;

    public Optional<Output<DomainScalingParametersGetArgs>> scalingParameters() {
        return Optional.ofNullable(this.scalingParameters);
    }

    /**
     * The service endpoint for requesting search results from a search domain.
     * 
     */
    @Import(name="searchServiceEndpoint")
    private @Nullable Output<String> searchServiceEndpoint;

    public Optional<Output<String>> searchServiceEndpoint() {
        return Optional.ofNullable(this.searchServiceEndpoint);
    }

    private DomainState() {}

    private DomainState(DomainState $) {
        this.arn = $.arn;
        this.documentServiceEndpoint = $.documentServiceEndpoint;
        this.domainId = $.domainId;
        this.endpointOptions = $.endpointOptions;
        this.indexFields = $.indexFields;
        this.multiAz = $.multiAz;
        this.name = $.name;
        this.scalingParameters = $.scalingParameters;
        this.searchServiceEndpoint = $.searchServiceEndpoint;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainState $;

        public Builder() {
            $ = new DomainState();
        }

        public Builder(DomainState defaults) {
            $ = new DomainState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder documentServiceEndpoint(@Nullable Output<String> documentServiceEndpoint) {
            $.documentServiceEndpoint = documentServiceEndpoint;
            return this;
        }

        public Builder documentServiceEndpoint(String documentServiceEndpoint) {
            return documentServiceEndpoint(Output.of(documentServiceEndpoint));
        }

        public Builder domainId(@Nullable Output<String> domainId) {
            $.domainId = domainId;
            return this;
        }

        public Builder domainId(String domainId) {
            return domainId(Output.of(domainId));
        }

        public Builder endpointOptions(@Nullable Output<DomainEndpointOptionsGetArgs> endpointOptions) {
            $.endpointOptions = endpointOptions;
            return this;
        }

        public Builder endpointOptions(DomainEndpointOptionsGetArgs endpointOptions) {
            return endpointOptions(Output.of(endpointOptions));
        }

        public Builder indexFields(@Nullable Output<List<DomainIndexFieldGetArgs>> indexFields) {
            $.indexFields = indexFields;
            return this;
        }

        public Builder indexFields(List<DomainIndexFieldGetArgs> indexFields) {
            return indexFields(Output.of(indexFields));
        }

        public Builder indexFields(DomainIndexFieldGetArgs... indexFields) {
            return indexFields(List.of(indexFields));
        }

        public Builder multiAz(@Nullable Output<Boolean> multiAz) {
            $.multiAz = multiAz;
            return this;
        }

        public Builder multiAz(Boolean multiAz) {
            return multiAz(Output.of(multiAz));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder scalingParameters(@Nullable Output<DomainScalingParametersGetArgs> scalingParameters) {
            $.scalingParameters = scalingParameters;
            return this;
        }

        public Builder scalingParameters(DomainScalingParametersGetArgs scalingParameters) {
            return scalingParameters(Output.of(scalingParameters));
        }

        public Builder searchServiceEndpoint(@Nullable Output<String> searchServiceEndpoint) {
            $.searchServiceEndpoint = searchServiceEndpoint;
            return this;
        }

        public Builder searchServiceEndpoint(String searchServiceEndpoint) {
            return searchServiceEndpoint(Output.of(searchServiceEndpoint));
        }

        public DomainState build() {
            return $;
        }
    }

}
