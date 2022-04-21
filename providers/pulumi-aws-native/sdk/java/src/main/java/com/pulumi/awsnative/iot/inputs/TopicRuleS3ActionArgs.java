// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iot.inputs;

import com.pulumi.awsnative.iot.enums.TopicRuleCannedAccessControlList;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleS3ActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleS3ActionArgs Empty = new TopicRuleS3ActionArgs();

    @Import(name="bucketName", required=true)
    private Output<String> bucketName;

    public Output<String> bucketName() {
        return this.bucketName;
    }

    @Import(name="cannedAcl")
    private @Nullable Output<TopicRuleCannedAccessControlList> cannedAcl;

    public Optional<Output<TopicRuleCannedAccessControlList>> cannedAcl() {
        return Optional.ofNullable(this.cannedAcl);
    }

    @Import(name="key", required=true)
    private Output<String> key;

    public Output<String> key() {
        return this.key;
    }

    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    public Output<String> roleArn() {
        return this.roleArn;
    }

    private TopicRuleS3ActionArgs() {}

    private TopicRuleS3ActionArgs(TopicRuleS3ActionArgs $) {
        this.bucketName = $.bucketName;
        this.cannedAcl = $.cannedAcl;
        this.key = $.key;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleS3ActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleS3ActionArgs $;

        public Builder() {
            $ = new TopicRuleS3ActionArgs();
        }

        public Builder(TopicRuleS3ActionArgs defaults) {
            $ = new TopicRuleS3ActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder bucketName(Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder cannedAcl(@Nullable Output<TopicRuleCannedAccessControlList> cannedAcl) {
            $.cannedAcl = cannedAcl;
            return this;
        }

        public Builder cannedAcl(TopicRuleCannedAccessControlList cannedAcl) {
            return cannedAcl(Output.of(cannedAcl));
        }

        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public TopicRuleS3ActionArgs build() {
            $.bucketName = Objects.requireNonNull($.bucketName, "expected parameter 'bucketName' to be non-null");
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
