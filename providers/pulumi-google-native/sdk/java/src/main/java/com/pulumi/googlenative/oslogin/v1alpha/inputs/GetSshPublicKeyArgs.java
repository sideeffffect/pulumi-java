// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.oslogin.v1alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSshPublicKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSshPublicKeyArgs Empty = new GetSshPublicKeyArgs();

    @Import(name="sshPublicKeyId", required=true)
    private Output<String> sshPublicKeyId;

    public Output<String> sshPublicKeyId() {
        return this.sshPublicKeyId;
    }

    @Import(name="userId", required=true)
    private Output<String> userId;

    public Output<String> userId() {
        return this.userId;
    }

    private GetSshPublicKeyArgs() {}

    private GetSshPublicKeyArgs(GetSshPublicKeyArgs $) {
        this.sshPublicKeyId = $.sshPublicKeyId;
        this.userId = $.userId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSshPublicKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSshPublicKeyArgs $;

        public Builder() {
            $ = new GetSshPublicKeyArgs();
        }

        public Builder(GetSshPublicKeyArgs defaults) {
            $ = new GetSshPublicKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder sshPublicKeyId(Output<String> sshPublicKeyId) {
            $.sshPublicKeyId = sshPublicKeyId;
            return this;
        }

        public Builder sshPublicKeyId(String sshPublicKeyId) {
            return sshPublicKeyId(Output.of(sshPublicKeyId));
        }

        public Builder userId(Output<String> userId) {
            $.userId = userId;
            return this;
        }

        public Builder userId(String userId) {
            return userId(Output.of(userId));
        }

        public GetSshPublicKeyArgs build() {
            $.sshPublicKeyId = Objects.requireNonNull($.sshPublicKeyId, "expected parameter 'sshPublicKeyId' to be non-null");
            $.userId = Objects.requireNonNull($.userId, "expected parameter 'userId' to be non-null");
            return $;
        }
    }

}
