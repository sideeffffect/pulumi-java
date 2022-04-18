// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.imagebuilder.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDistributionConfigurationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDistributionConfigurationArgs Empty = new GetDistributionConfigurationArgs();

    /**
     * Amazon Resource Name (ARN) of the distribution configuration.
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String arn() {
        return this.arn;
    }

    /**
     * Key-value map of resource tags for the distribution configuration.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetDistributionConfigurationArgs(
        String arn,
        @Nullable Map<String,String> tags) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.tags = tags;
    }

    private GetDistributionConfigurationArgs() {
        this.arn = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDistributionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDistributionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }        public GetDistributionConfigurationArgs build() {
            return new GetDistributionConfigurationArgs(arn, tags);
        }
    }
}
