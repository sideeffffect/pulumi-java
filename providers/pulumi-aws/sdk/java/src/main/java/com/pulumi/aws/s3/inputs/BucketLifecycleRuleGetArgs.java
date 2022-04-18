// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3.inputs;

import com.pulumi.aws.s3.inputs.BucketLifecycleRuleExpirationGetArgs;
import com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionExpirationGetArgs;
import com.pulumi.aws.s3.inputs.BucketLifecycleRuleNoncurrentVersionTransitionGetArgs;
import com.pulumi.aws.s3.inputs.BucketLifecycleRuleTransitionGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketLifecycleRuleGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final BucketLifecycleRuleGetArgs Empty = new BucketLifecycleRuleGetArgs();

    /**
     * Specifies the number of days after initiating a multipart upload when the multipart upload must be completed.
     * 
     */
    @Import(name="abortIncompleteMultipartUploadDays")
      private final @Nullable Output<Integer> abortIncompleteMultipartUploadDays;

    public Output<Integer> abortIncompleteMultipartUploadDays() {
        return this.abortIncompleteMultipartUploadDays == null ? Codegen.empty() : this.abortIncompleteMultipartUploadDays;
    }

    /**
     * Specifies lifecycle rule status.
     * 
     */
    @Import(name="enabled", required=true)
      private final Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * Specifies a period in the object's expire (documented below).
     * 
     */
    @Import(name="expiration")
      private final @Nullable Output<BucketLifecycleRuleExpirationGetArgs> expiration;

    public Output<BucketLifecycleRuleExpirationGetArgs> expiration() {
        return this.expiration == null ? Codegen.empty() : this.expiration;
    }

    /**
     * Unique identifier for the rule. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> id() {
        return this.id == null ? Codegen.empty() : this.id;
    }

    /**
     * Specifies when noncurrent object versions expire (documented below).
     * 
     */
    @Import(name="noncurrentVersionExpiration")
      private final @Nullable Output<BucketLifecycleRuleNoncurrentVersionExpirationGetArgs> noncurrentVersionExpiration;

    public Output<BucketLifecycleRuleNoncurrentVersionExpirationGetArgs> noncurrentVersionExpiration() {
        return this.noncurrentVersionExpiration == null ? Codegen.empty() : this.noncurrentVersionExpiration;
    }

    /**
     * Specifies when noncurrent object versions transitions (documented below).
     * 
     */
    @Import(name="noncurrentVersionTransitions")
      private final @Nullable Output<List<BucketLifecycleRuleNoncurrentVersionTransitionGetArgs>> noncurrentVersionTransitions;

    public Output<List<BucketLifecycleRuleNoncurrentVersionTransitionGetArgs>> noncurrentVersionTransitions() {
        return this.noncurrentVersionTransitions == null ? Codegen.empty() : this.noncurrentVersionTransitions;
    }

    /**
     * Object key prefix identifying one or more objects to which the rule applies.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> prefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    /**
     * Specifies object tags key and value.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Specifies a period in the object's transitions (documented below).
     * 
     */
    @Import(name="transitions")
      private final @Nullable Output<List<BucketLifecycleRuleTransitionGetArgs>> transitions;

    public Output<List<BucketLifecycleRuleTransitionGetArgs>> transitions() {
        return this.transitions == null ? Codegen.empty() : this.transitions;
    }

    public BucketLifecycleRuleGetArgs(
        @Nullable Output<Integer> abortIncompleteMultipartUploadDays,
        Output<Boolean> enabled,
        @Nullable Output<BucketLifecycleRuleExpirationGetArgs> expiration,
        @Nullable Output<String> id,
        @Nullable Output<BucketLifecycleRuleNoncurrentVersionExpirationGetArgs> noncurrentVersionExpiration,
        @Nullable Output<List<BucketLifecycleRuleNoncurrentVersionTransitionGetArgs>> noncurrentVersionTransitions,
        @Nullable Output<String> prefix,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<BucketLifecycleRuleTransitionGetArgs>> transitions) {
        this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.expiration = expiration;
        this.id = id;
        this.noncurrentVersionExpiration = noncurrentVersionExpiration;
        this.noncurrentVersionTransitions = noncurrentVersionTransitions;
        this.prefix = prefix;
        this.tags = tags;
        this.transitions = transitions;
    }

    private BucketLifecycleRuleGetArgs() {
        this.abortIncompleteMultipartUploadDays = Codegen.empty();
        this.enabled = Codegen.empty();
        this.expiration = Codegen.empty();
        this.id = Codegen.empty();
        this.noncurrentVersionExpiration = Codegen.empty();
        this.noncurrentVersionTransitions = Codegen.empty();
        this.prefix = Codegen.empty();
        this.tags = Codegen.empty();
        this.transitions = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketLifecycleRuleGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> abortIncompleteMultipartUploadDays;
        private Output<Boolean> enabled;
        private @Nullable Output<BucketLifecycleRuleExpirationGetArgs> expiration;
        private @Nullable Output<String> id;
        private @Nullable Output<BucketLifecycleRuleNoncurrentVersionExpirationGetArgs> noncurrentVersionExpiration;
        private @Nullable Output<List<BucketLifecycleRuleNoncurrentVersionTransitionGetArgs>> noncurrentVersionTransitions;
        private @Nullable Output<String> prefix;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<BucketLifecycleRuleTransitionGetArgs>> transitions;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketLifecycleRuleGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.abortIncompleteMultipartUploadDays = defaults.abortIncompleteMultipartUploadDays;
    	      this.enabled = defaults.enabled;
    	      this.expiration = defaults.expiration;
    	      this.id = defaults.id;
    	      this.noncurrentVersionExpiration = defaults.noncurrentVersionExpiration;
    	      this.noncurrentVersionTransitions = defaults.noncurrentVersionTransitions;
    	      this.prefix = defaults.prefix;
    	      this.tags = defaults.tags;
    	      this.transitions = defaults.transitions;
        }

        public Builder abortIncompleteMultipartUploadDays(@Nullable Output<Integer> abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            return this;
        }
        public Builder abortIncompleteMultipartUploadDays(@Nullable Integer abortIncompleteMultipartUploadDays) {
            this.abortIncompleteMultipartUploadDays = Codegen.ofNullable(abortIncompleteMultipartUploadDays);
            return this;
        }
        public Builder enabled(Output<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Output.of(Objects.requireNonNull(enabled));
            return this;
        }
        public Builder expiration(@Nullable Output<BucketLifecycleRuleExpirationGetArgs> expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder expiration(@Nullable BucketLifecycleRuleExpirationGetArgs expiration) {
            this.expiration = Codegen.ofNullable(expiration);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Codegen.ofNullable(id);
            return this;
        }
        public Builder noncurrentVersionExpiration(@Nullable Output<BucketLifecycleRuleNoncurrentVersionExpirationGetArgs> noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = noncurrentVersionExpiration;
            return this;
        }
        public Builder noncurrentVersionExpiration(@Nullable BucketLifecycleRuleNoncurrentVersionExpirationGetArgs noncurrentVersionExpiration) {
            this.noncurrentVersionExpiration = Codegen.ofNullable(noncurrentVersionExpiration);
            return this;
        }
        public Builder noncurrentVersionTransitions(@Nullable Output<List<BucketLifecycleRuleNoncurrentVersionTransitionGetArgs>> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = noncurrentVersionTransitions;
            return this;
        }
        public Builder noncurrentVersionTransitions(@Nullable List<BucketLifecycleRuleNoncurrentVersionTransitionGetArgs> noncurrentVersionTransitions) {
            this.noncurrentVersionTransitions = Codegen.ofNullable(noncurrentVersionTransitions);
            return this;
        }
        public Builder noncurrentVersionTransitions(BucketLifecycleRuleNoncurrentVersionTransitionGetArgs... noncurrentVersionTransitions) {
            return noncurrentVersionTransitions(List.of(noncurrentVersionTransitions));
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder transitions(@Nullable Output<List<BucketLifecycleRuleTransitionGetArgs>> transitions) {
            this.transitions = transitions;
            return this;
        }
        public Builder transitions(@Nullable List<BucketLifecycleRuleTransitionGetArgs> transitions) {
            this.transitions = Codegen.ofNullable(transitions);
            return this;
        }
        public Builder transitions(BucketLifecycleRuleTransitionGetArgs... transitions) {
            return transitions(List.of(transitions));
        }        public BucketLifecycleRuleGetArgs build() {
            return new BucketLifecycleRuleGetArgs(abortIncompleteMultipartUploadDays, enabled, expiration, id, noncurrentVersionExpiration, noncurrentVersionTransitions, prefix, tags, transitions);
        }
    }
}
