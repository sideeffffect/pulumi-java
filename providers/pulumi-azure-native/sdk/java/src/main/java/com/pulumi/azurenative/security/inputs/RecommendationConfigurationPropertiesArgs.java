// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.security.inputs;

import com.pulumi.azurenative.security.enums.RecommendationConfigStatus;
import com.pulumi.azurenative.security.enums.RecommendationType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The type of IoT Security recommendation.
 * 
 */
public final class RecommendationConfigurationPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecommendationConfigurationPropertiesArgs Empty = new RecommendationConfigurationPropertiesArgs();

    /**
     * The type of IoT Security recommendation.
     * 
     */
    @Import(name="recommendationType", required=true)
    private Output<Either<String,RecommendationType>> recommendationType;

    public Output<Either<String,RecommendationType>> recommendationType() {
        return this.recommendationType;
    }

    /**
     * Recommendation status. When the recommendation status is disabled recommendations are not generated.
     * 
     */
    @Import(name="status", required=true)
    private Output<Either<String,RecommendationConfigStatus>> status;

    public Output<Either<String,RecommendationConfigStatus>> status() {
        return this.status;
    }

    private RecommendationConfigurationPropertiesArgs() {}

    private RecommendationConfigurationPropertiesArgs(RecommendationConfigurationPropertiesArgs $) {
        this.recommendationType = $.recommendationType;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecommendationConfigurationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecommendationConfigurationPropertiesArgs $;

        public Builder() {
            $ = new RecommendationConfigurationPropertiesArgs();
        }

        public Builder(RecommendationConfigurationPropertiesArgs defaults) {
            $ = new RecommendationConfigurationPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder recommendationType(Output<Either<String,RecommendationType>> recommendationType) {
            $.recommendationType = recommendationType;
            return this;
        }

        public Builder recommendationType(Either<String,RecommendationType> recommendationType) {
            return recommendationType(Output.of(recommendationType));
        }

        public Builder status(Output<Either<String,RecommendationConfigStatus>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,RecommendationConfigStatus> status) {
            return status(Output.of(status));
        }

        public RecommendationConfigurationPropertiesArgs build() {
            $.recommendationType = Objects.requireNonNull($.recommendationType, "expected parameter 'recommendationType' to be non-null");
            $.status = Codegen.stringProp("status").left(RecommendationConfigStatus.class).output().arg($.status).def("Enabled").require();
            return $;
        }
    }

}
