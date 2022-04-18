// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.azurenative.storage.inputs.UpdateHistoryPropertyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties of an ImmutabilityPolicy of a blob container.
 * 
 */
public final class ImmutabilityPolicyPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final ImmutabilityPolicyPropertiesResponse Empty = new ImmutabilityPolicyPropertiesResponse();

    /**
     * This property can only be changed for unlocked time-based retention policies. When enabled, new blocks can be written to an append blob while maintaining immutability protection and compliance. Only new blocks can be added and any existing blocks cannot be modified or deleted. This property cannot be changed with ExtendImmutabilityPolicy API
     * 
     */
    @Import(name="allowProtectedAppendWrites")
      private final @Nullable Boolean allowProtectedAppendWrites;

    public Optional<Boolean> allowProtectedAppendWrites() {
        return this.allowProtectedAppendWrites == null ? Optional.empty() : Optional.ofNullable(this.allowProtectedAppendWrites);
    }

    /**
     * ImmutabilityPolicy Etag.
     * 
     */
    @Import(name="etag", required=true)
      private final String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    @Import(name="immutabilityPeriodSinceCreationInDays")
      private final @Nullable Integer immutabilityPeriodSinceCreationInDays;

    public Optional<Integer> immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays == null ? Optional.empty() : Optional.ofNullable(this.immutabilityPeriodSinceCreationInDays);
    }

    /**
     * The ImmutabilityPolicy state of a blob container, possible values include: Locked and Unlocked.
     * 
     */
    @Import(name="state", required=true)
      private final String state;

    public String state() {
        return this.state;
    }

    /**
     * The ImmutabilityPolicy update history of the blob container.
     * 
     */
    @Import(name="updateHistory", required=true)
      private final List<UpdateHistoryPropertyResponse> updateHistory;

    public List<UpdateHistoryPropertyResponse> updateHistory() {
        return this.updateHistory;
    }

    public ImmutabilityPolicyPropertiesResponse(
        @Nullable Boolean allowProtectedAppendWrites,
        String etag,
        @Nullable Integer immutabilityPeriodSinceCreationInDays,
        String state,
        List<UpdateHistoryPropertyResponse> updateHistory) {
        this.allowProtectedAppendWrites = allowProtectedAppendWrites;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
        this.updateHistory = Objects.requireNonNull(updateHistory, "expected parameter 'updateHistory' to be non-null");
    }

    private ImmutabilityPolicyPropertiesResponse() {
        this.allowProtectedAppendWrites = null;
        this.etag = null;
        this.immutabilityPeriodSinceCreationInDays = null;
        this.state = null;
        this.updateHistory = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImmutabilityPolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean allowProtectedAppendWrites;
        private String etag;
        private @Nullable Integer immutabilityPeriodSinceCreationInDays;
        private String state;
        private List<UpdateHistoryPropertyResponse> updateHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(ImmutabilityPolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowProtectedAppendWrites = defaults.allowProtectedAppendWrites;
    	      this.etag = defaults.etag;
    	      this.immutabilityPeriodSinceCreationInDays = defaults.immutabilityPeriodSinceCreationInDays;
    	      this.state = defaults.state;
    	      this.updateHistory = defaults.updateHistory;
        }

        public Builder allowProtectedAppendWrites(@Nullable Boolean allowProtectedAppendWrites) {
            this.allowProtectedAppendWrites = allowProtectedAppendWrites;
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder immutabilityPeriodSinceCreationInDays(@Nullable Integer immutabilityPeriodSinceCreationInDays) {
            this.immutabilityPeriodSinceCreationInDays = immutabilityPeriodSinceCreationInDays;
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder updateHistory(List<UpdateHistoryPropertyResponse> updateHistory) {
            this.updateHistory = Objects.requireNonNull(updateHistory);
            return this;
        }
        public Builder updateHistory(UpdateHistoryPropertyResponse... updateHistory) {
            return updateHistory(List.of(updateHistory));
        }        public ImmutabilityPolicyPropertiesResponse build() {
            return new ImmutabilityPolicyPropertiesResponse(allowProtectedAppendWrites, etag, immutabilityPeriodSinceCreationInDays, state, updateHistory);
        }
    }
}
