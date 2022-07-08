// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudresourcemanager.v3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTagKeyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagKeyPlainArgs Empty = new GetTagKeyPlainArgs();

    @Import(name="tagKeyId", required=true)
    private String tagKeyId;

    public String tagKeyId() {
        return this.tagKeyId;
    }

    private GetTagKeyPlainArgs() {}

    private GetTagKeyPlainArgs(GetTagKeyPlainArgs $) {
        this.tagKeyId = $.tagKeyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagKeyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagKeyPlainArgs $;

        public Builder() {
            $ = new GetTagKeyPlainArgs();
        }

        public Builder(GetTagKeyPlainArgs defaults) {
            $ = new GetTagKeyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder tagKeyId(String tagKeyId) {
            $.tagKeyId = tagKeyId;
            return this;
        }

        public GetTagKeyPlainArgs build() {
            $.tagKeyId = Objects.requireNonNull($.tagKeyId, "expected parameter 'tagKeyId' to be non-null");
            return $;
        }
    }

}
