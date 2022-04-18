// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.s3.inputs;

import com.pulumi.awsnative.s3.enums.BucketRuleStatus;
import com.pulumi.awsnative.s3.inputs.BucketAbortIncompleteMultipartUpload;
import com.pulumi.awsnative.s3.inputs.BucketNoncurrentVersionExpiration;
import com.pulumi.awsnative.s3.inputs.BucketNoncurrentVersionTransition;
import com.pulumi.awsnative.s3.inputs.BucketTagFilter;
import com.pulumi.awsnative.s3.inputs.BucketTransition;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * You must specify at least one of the following properties: AbortIncompleteMultipartUpload, ExpirationDate, ExpirationInDays, NoncurrentVersionExpirationInDays, NoncurrentVersionTransition, NoncurrentVersionTransitions, Transition, or Transitions.
 * 
 */
public final class BucketRule extends com.pulumi.resources.InvokeArgs {

    public static final BucketRule Empty = new BucketRule();

    @Import(name="abortIncompleteMultipartUpload")
      private final @Nullable BucketAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;

    public Optional<BucketAbortIncompleteMultipartUpload> abortIncompleteMultipartUpload() {
        return this.abortIncompleteMultipartUpload == null ? Optional.empty() : Optional.ofNullable(this.abortIncompleteMultipartUpload);
    }

    @Import(name="expirationDate")
      private final @Nullable String expirationDate;

    public Optional<String> expirationDate() {
        return this.expirationDate == null ? Optional.empty() : Optional.ofNullable(this.expirationDate);
    }

    @Import(name="expirationInDays")
      private final @Nullable Integer expirationInDays;

    public Optional<Integer> expirationInDays() {
        return this.expirationInDays == null ? Optional.empty() : Optional.ofNullable(this.expirationInDays);
    }

    @Import(name="expiredObjectDeleteMarker")
      private final @Nullable Boolean expiredObjectDeleteMarker;

    public Optional<Boolean> expiredObjectDeleteMarker() {
        return this.expiredObjectDeleteMarker == null ? Optional.empty() : Optional.ofNullable(this.expiredObjectDeleteMarker);
    }

    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> id() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @Import(name="noncurrentVersionExpiration")
      private final @Nullable BucketNoncurrentVersionExpiration noncurrentVersionExpiration;

    public Optional<BucketNoncurrentVersionExpiration> noncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration == null ? Optional.empty() : Optional.ofNullable(this.noncurrentVersionExpiration);
    }

    @Import(name="noncurrentVersionExpirationInDays")
      private final @Nullable Integer noncurrentVersionExpirationInDays;

    public Optional<Integer> noncurrentVersionExpirationInDays() {
        return this.noncurrentVersionExpirationInDays == null ? Optional.empty() : Optional.ofNullable(this.noncurrentVersionExpirationInDays);
    }

    @Import(name="noncurrentVersionTransition")
      private final @Nullable BucketNoncurrentVersionTransition noncurrentVersionTransition;

    public Optional<BucketNoncurrentVersionTransition> noncurrentVersionTransition() {
        return this.noncurrentVersionTransition == null ? Optional.empty() : Optional.ofNullable(this.noncurrentVersionTransition);
    }

    @Import(name="noncurrentVersionTransitions")
      private final @Nullable List<BucketNoncurrentVersionTransition> noncurrentVersionTransitions;

    public List<BucketNoncurrentVersionTransition> noncurrentVersionTransitions() {
        return this.noncurrentVersionTransitions == null ? List.of() : this.noncurrentVersionTransitions;
    }

    @Import(name="objectSizeGreaterThan")
      private final @Nullable String objectSizeGreaterThan;

    public Optional<String> objectSizeGreaterThan() {
        return this.objectSizeGreaterThan == null ? Optional.empty() : Optional.ofNullable(this.objectSizeGreaterThan);
    }

    @Import(name="objectSizeLessThan")
      private final @Nullable String objectSizeLessThan;

    public Optional<String> objectSizeLessThan() {
        return this.objectSizeLessThan == null ? Optional.empty() : Optional.ofNullable(this.objectSizeLessThan);
    }

    @Import(name="prefix")
      private final @Nullable String prefix;

    public Optional<String> prefix() {
        return this.prefix == null ? Optional.empty() : Optional.ofNullable(this.prefix);
    }

    @Import(name="status", required=true)
      private final BucketRuleStatus status;

    public BucketRuleStatus status() {
        return this.status;
    }

    @Import(name="tagFilters")
      private final @Nullable List<BucketTagFilter> tagFilters;

    public List<BucketTagFilter> tagFilters() {
        return this.tagFilters == null ? List.of() : this.tagFilters;
    }

    @Import(name="transition")
      private final @Nullable BucketTransition transition;

    public Optional<BucketTransition> transition() {
        return this.transition == null ? Optional.empty() : Optional.ofNullable(this.transition);
    }

    @Import(name="transitions")
      private final @Nullable List<BucketTransition> transitions;

    public List<BucketTransition> transitions() {
        return this.transitions == null ? List.of() : this.transitions;
    }

    public BucketRule(
        @Nullable BucketAbortIncompleteMultipartUpload abortIncompleteMultipartUpload,
        @Nullable String expirationDate,
        @Nullable Integer expirationInDays,
        @Nullable Boolean expiredObjectDeleteMarker,
        @Nullable String id,
        @Nullable BucketNoncurrentVersionExpiration noncurrentVersionExpiration,
        @Nullable Integer noncurrentVersionExpirationInDays,
        @Nullable BucketNoncurrentVersionTransition noncurrentVersionTransition,
        @Nullable List<BucketNoncurrentVersionTransition> noncurrentVersionTransitions,
        @Nullable String objectSizeGreaterThan,
        @Nullable String objectSizeLessThan,
        @Nullable String prefix,
        BucketRuleStatus status,
        @Nullable List<BucketTagFilter> tagFilters,
        @Nullable BucketTransition transition,
        @Nullable List<BucketTransition> transitions) {
        this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
        this.expirationDate = expirationDate;
        this.expirationInDays = expirationInDays;
        this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
        this.id = id;
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
        this.noncurrentVersionTransition = noncurrentVersionTransition;
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        this.objectSizeGreaterThan = objectSizeGreaterThan;
        this.objectSizeLessThan = objectSizeLessThan;
        this.prefix = prefix;
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.tagFilters = tagFilters;
        this.transition = transition;
        this.transitions = transitions;
    }

    private BucketRule() {
        this.abortIncompleteMultipartUpload = null;
        this.expirationDate = null;
        this.expirationInDays = null;
        this.expiredObjectDeleteMarker = null;
        this.id = null;
        this.noncurrentVersionExpiration = null;
        this.noncurrentVersionExpirationInDays = null;
        this.noncurrentVersionTransition = null;
        this.noncurrentVersionTransitions = List.of();
        this.objectSizeGreaterThan = null;
        this.objectSizeLessThan = null;
        this.prefix = null;
        this.status = null;
        this.tagFilters = List.of();
        this.transition = null;
        this.transitions = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BucketAbortIncompleteMultipartUpload abortIncompleteMultipartUpload;
        private @Nullable String expirationDate;
        private @Nullable Integer expirationInDays;
        private @Nullable Boolean expiredObjectDeleteMarker;
        private @Nullable String id;
        private @Nullable BucketNoncurrentVersionExpiration noncurrentVersionExpiration;
        private @Nullable Integer noncurrentVersionExpirationInDays;
        private @Nullable BucketNoncurrentVersionTransition noncurrentVersionTransition;
        private @Nullable List<BucketNoncurrentVersionTransition> noncurrentVersionTransitions;
        private @Nullable String objectSizeGreaterThan;
        private @Nullable String objectSizeLessThan;
        private @Nullable String prefix;
        private BucketRuleStatus status;
        private @Nullable List<BucketTagFilter> tagFilters;
        private @Nullable BucketTransition transition;
        private @Nullable List<BucketTransition> transitions;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUpload = defaults.abortIncompleteMultipartUpload;
    	      this.expirationDate = defaults.expirationDate;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.expiredObjectDeleteMarker = defaults.expiredObjectDeleteMarker;
    	      this.id = defaults.id;
    	      this.noncurrentVersionExpiration = defaults.noncurrentVersionExpiration;
    	      this.noncurrentVersionExpirationInDays = defaults.noncurrentVersionExpirationInDays;
    	      this.noncurrentVersionTransition = defaults.noncurrentVersionTransition;
    	      this.noncurrentVersionTransitions = defaults.noncurrentVersionTransitions;
    	      this.objectSizeGreaterThan = defaults.objectSizeGreaterThan;
    	      this.objectSizeLessThan = defaults.objectSizeLessThan;
    	      this.prefix = defaults.prefix;
    	      this.status = defaults.status;
    	      this.tagFilters = defaults.tagFilters;
    	      this.transition = defaults.transition;
    	      this.transitions = defaults.transitions;
        }

        public Builder abortIncompleteMultipartUpload(@Nullable BucketAbortIncompleteMultipartUpload abortIncompleteMultipartUpload) {
            this.abortIncompleteMultipartUpload = abortIncompleteMultipartUpload;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationInDays(@Nullable Integer expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }
        public Builder expiredObjectDeleteMarker(@Nullable Boolean expiredObjectDeleteMarker) {
            this.expiredObjectDeleteMarker = expiredObjectDeleteMarker;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder noncurrentVersionExpiration(@Nullable BucketNoncurrentVersionExpiration noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }
        public Builder noncurrentVersionExpirationInDays(@Nullable Integer noncurrentVersionExpirationInDays) {
            this.noncurrentVersionExpirationInDays = noncurrentVersionExpirationInDays;
            return this;
        }
        public Builder noncurrentVersionTransition(@Nullable BucketNoncurrentVersionTransition noncurrentVersionTransition) {
            this.noncurrentVersionTransition = noncurrentVersionTransition;
            return this;
        }
        public Builder noncurrentVersionTransitions(@Nullable List<BucketNoncurrentVersionTransition> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }
        public Builder noncurrentVersionTransitions(BucketNoncurrentVersionTransition... noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(List.of(noncurrentVersionTransitions));
        }
        public Builder objectSizeGreaterThan(@Nullable String objectSizeGreaterThan) {
            this.objectSizeGreaterThan = objectSizeGreaterThan;
            return this;
        }
        public Builder objectSizeLessThan(@Nullable String objectSizeLessThan) {
            this.objectSizeLessThan = objectSizeLessThan;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder status(BucketRuleStatus status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder tagFilters(@Nullable List<BucketTagFilter> tagFilters) {
            this.tagFilters = tagFilters;
            return this;
        }
        public Builder tagFilters(BucketTagFilter... tagFilters) {
            return tagFilters(List.of(tagFilters));
        }
        public Builder transition(@Nullable BucketTransition transition) {
            this.transition = transition;
            return this;
        }
        public Builder transitions(@Nullable List<BucketTransition> transitions) {
            this.transitions = transitions;
            return this;
        }
        public Builder transitions(BucketTransition... transitions) {
            return transitions(List.of(transitions));
        }        public BucketRule build() {
            return new BucketRule(abortIncompleteMultipartUpload, expirationDate, expirationInDays, expiredObjectDeleteMarker, id, noncurrentVersionExpiration, noncurrentVersionExpirationInDays, noncurrentVersionTransition, noncurrentVersionTransitions, objectSizeGreaterThan, objectSizeLessThan, prefix, status, tagFilters, transition, transitions);
        }
    }
}
