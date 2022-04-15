// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InsightFiltersFindingProviderFieldsConfidenceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersFindingProviderFieldsConfidenceGetArgs Empty = new InsightFiltersFindingProviderFieldsConfidenceGetArgs();

    /**
     * The equal-to condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="eq")
      private final @Nullable Output<String> eq;

    public Output<String> eq() {
        return this.eq == null ? Codegen.empty() : this.eq;
    }

    /**
     * The greater-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="gte")
      private final @Nullable Output<String> gte;

    public Output<String> gte() {
        return this.gte == null ? Codegen.empty() : this.gte;
    }

    /**
     * The less-than-equal condition to be applied to a single field when querying for findings, provided as a String.
     * 
     */
    @Import(name="lte")
      private final @Nullable Output<String> lte;

    public Output<String> lte() {
        return this.lte == null ? Codegen.empty() : this.lte;
    }

    public InsightFiltersFindingProviderFieldsConfidenceGetArgs(
        @Nullable Output<String> eq,
        @Nullable Output<String> gte,
        @Nullable Output<String> lte) {
        this.eq = eq;
        this.gte = gte;
        this.lte = lte;
    }

    private InsightFiltersFindingProviderFieldsConfidenceGetArgs() {
        this.eq = Codegen.empty();
        this.gte = Codegen.empty();
        this.lte = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersFindingProviderFieldsConfidenceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> eq;
        private @Nullable Output<String> gte;
        private @Nullable Output<String> lte;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersFindingProviderFieldsConfidenceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eq = defaults.eq;
    	      this.gte = defaults.gte;
    	      this.lte = defaults.lte;
        }

        public Builder eq(@Nullable Output<String> eq) {
            this.eq = eq;
            return this;
        }
        public Builder eq(@Nullable String eq) {
            this.eq = Codegen.ofNullable(eq);
            return this;
        }
        public Builder gte(@Nullable Output<String> gte) {
            this.gte = gte;
            return this;
        }
        public Builder gte(@Nullable String gte) {
            this.gte = Codegen.ofNullable(gte);
            return this;
        }
        public Builder lte(@Nullable Output<String> lte) {
            this.lte = lte;
            return this;
        }
        public Builder lte(@Nullable String lte) {
            this.lte = Codegen.ofNullable(lte);
            return this;
        }        public InsightFiltersFindingProviderFieldsConfidenceGetArgs build() {
            return new InsightFiltersFindingProviderFieldsConfidenceGetArgs(eq, gte, lte);
        }
    }
}
