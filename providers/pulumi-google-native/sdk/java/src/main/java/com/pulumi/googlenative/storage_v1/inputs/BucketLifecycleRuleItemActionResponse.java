// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The action to take.
 * 
 */
public final class BucketLifecycleRuleItemActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final BucketLifecycleRuleItemActionResponse Empty = new BucketLifecycleRuleItemActionResponse();

    /**
     * Target storage class. Required iff the type of the action is SetStorageClass.
     * 
     */
    @Import(name="storageClass", required=true)
    private String storageClass;

    public String storageClass() {
        return this.storageClass;
    }

    /**
     * Type of the action. Currently, only Delete and SetStorageClass are supported.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private BucketLifecycleRuleItemActionResponse() {}

    private BucketLifecycleRuleItemActionResponse(BucketLifecycleRuleItemActionResponse $) {
        this.storageClass = $.storageClass;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BucketLifecycleRuleItemActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BucketLifecycleRuleItemActionResponse $;

        public Builder() {
            $ = new BucketLifecycleRuleItemActionResponse();
        }

        public Builder(BucketLifecycleRuleItemActionResponse defaults) {
            $ = new BucketLifecycleRuleItemActionResponse(Objects.requireNonNull(defaults));
        }

        public Builder storageClass(String storageClass) {
            $.storageClass = storageClass;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public BucketLifecycleRuleItemActionResponse build() {
            $.storageClass = Objects.requireNonNull($.storageClass, "expected parameter 'storageClass' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
