// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hdinsight.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The quota properties for the cluster.
 * 
 */
public final class QuotaInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final QuotaInfoResponse Empty = new QuotaInfoResponse();

    /**
     * The cores used by the cluster.
     * 
     */
    @Import(name="coresUsed")
      private final @Nullable Integer coresUsed;

    public Optional<Integer> coresUsed() {
        return this.coresUsed == null ? Optional.empty() : Optional.ofNullable(this.coresUsed);
    }

    public QuotaInfoResponse(@Nullable Integer coresUsed) {
        this.coresUsed = coresUsed;
    }

    private QuotaInfoResponse() {
        this.coresUsed = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuotaInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer coresUsed;

        public Builder() {
    	      // Empty
        }

        public Builder(QuotaInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coresUsed = defaults.coresUsed;
        }

        public Builder coresUsed(@Nullable Integer coresUsed) {
            this.coresUsed = coresUsed;
            return this;
        }        public QuotaInfoResponse build() {
            return new QuotaInfoResponse(coresUsed);
        }
    }
}
