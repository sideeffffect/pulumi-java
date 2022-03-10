// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.groundstation.outputs;

import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupEndpointDetails;
import io.pulumi.awsnative.groundstation.outputs.DataflowEndpointGroupTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataflowEndpointGroupResult {
    private final @Nullable String arn;
    private final @Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails;
    private final @Nullable String id;
    private final @Nullable List<DataflowEndpointGroupTag> tags;

    @OutputCustomType.Constructor
    private GetDataflowEndpointGroupResult(
        @OutputCustomType.Parameter("arn") @Nullable String arn,
        @OutputCustomType.Parameter("endpointDetails") @Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("tags") @Nullable List<DataflowEndpointGroupTag> tags) {
        this.arn = arn;
        this.endpointDetails = endpointDetails;
        this.id = id;
        this.tags = tags;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public List<DataflowEndpointGroupEndpointDetails> getEndpointDetails() {
        return this.endpointDetails == null ? List.of() : this.endpointDetails;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public List<DataflowEndpointGroupTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataflowEndpointGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails;
        private @Nullable String id;
        private @Nullable List<DataflowEndpointGroupTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataflowEndpointGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.endpointDetails = defaults.endpointDetails;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder endpointDetails(@Nullable List<DataflowEndpointGroupEndpointDetails> endpointDetails) {
            this.endpointDetails = endpointDetails;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder tags(@Nullable List<DataflowEndpointGroupTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetDataflowEndpointGroupResult build() {
            return new GetDataflowEndpointGroupResult(arn, endpointDetails, id, tags);
        }
    }
}
