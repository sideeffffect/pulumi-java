// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kms.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyPlainArgs Empty = new GetKeyPlainArgs();

    @Import(name="keyId", required=true)
    private String keyId;

    public String keyId() {
        return this.keyId;
    }

    private GetKeyPlainArgs() {}

    private GetKeyPlainArgs(GetKeyPlainArgs $) {
        this.keyId = $.keyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyPlainArgs $;

        public Builder() {
            $ = new GetKeyPlainArgs();
        }

        public Builder(GetKeyPlainArgs defaults) {
            $ = new GetKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder keyId(String keyId) {
            $.keyId = keyId;
            return this;
        }

        public GetKeyPlainArgs build() {
            $.keyId = Objects.requireNonNull($.keyId, "expected parameter 'keyId' to be non-null");
            return $;
        }
    }

}
