// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApiKeyStageKey {
    /**
     * The ID of a RestApi resource that includes the stage with which you want to associate the API key.
     * 
     */
    private final @Nullable String restApiId;
    /**
     * The name of the stage with which to associate the API key. The stage must be included in the RestApi resource that you specified in the RestApiId property.
     * 
     */
    private final @Nullable String stageName;

    @OutputCustomType.Constructor
    private ApiKeyStageKey(
        @OutputCustomType.Parameter("restApiId") @Nullable String restApiId,
        @OutputCustomType.Parameter("stageName") @Nullable String stageName) {
        this.restApiId = restApiId;
        this.stageName = stageName;
    }

    /**
     * The ID of a RestApi resource that includes the stage with which you want to associate the API key.
     * 
    */
    public Optional<String> getRestApiId() {
        return Optional.ofNullable(this.restApiId);
    }
    /**
     * The name of the stage with which to associate the API key. The stage must be included in the RestApi resource that you specified in the RestApiId property.
     * 
    */
    public Optional<String> getStageName() {
        return Optional.ofNullable(this.stageName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyStageKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String restApiId;
        private @Nullable String stageName;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyStageKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.restApiId = defaults.restApiId;
    	      this.stageName = defaults.stageName;
        }

        public Builder restApiId(@Nullable String restApiId) {
            this.restApiId = restApiId;
            return this;
        }

        public Builder stageName(@Nullable String stageName) {
            this.stageName = stageName;
            return this;
        }
        public ApiKeyStageKey build() {
            return new ApiKeyStageKey(restApiId, stageName);
        }
    }
}
