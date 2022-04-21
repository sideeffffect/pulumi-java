// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetReplicaKeyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetReplicaKeyArgs Empty = new GetReplicaKeyArgs();

    @Import(name="keyId", required=true)
    private String keyId;

    public String keyId() {
        return this.keyId;
    }

    private GetReplicaKeyArgs() {}

    private GetReplicaKeyArgs(GetReplicaKeyArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetReplicaKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetReplicaKeyArgs $;

        public Builder() {
            $ = new GetReplicaKeyArgs();
        }

        public Builder(GetReplicaKeyArgs defaults) {
            $ = new GetReplicaKeyArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        public GetReplicaKeyArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
