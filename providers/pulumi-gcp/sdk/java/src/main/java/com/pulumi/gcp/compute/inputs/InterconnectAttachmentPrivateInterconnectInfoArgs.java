// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class InterconnectAttachmentPrivateInterconnectInfoArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectAttachmentPrivateInterconnectInfoArgs Empty = new InterconnectAttachmentPrivateInterconnectInfoArgs();

    @Import(name="tag8021q")
    private @Nullable Output<Integer> tag8021q;

    public Optional<Output<Integer>> tag8021q() {
        return Optional.ofNullable(this.tag8021q);
    }

    private InterconnectAttachmentPrivateInterconnectInfoArgs() {}

    private InterconnectAttachmentPrivateInterconnectInfoArgs(InterconnectAttachmentPrivateInterconnectInfoArgs $) {
        this.tag8021q = $.tag8021q;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InterconnectAttachmentPrivateInterconnectInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InterconnectAttachmentPrivateInterconnectInfoArgs $;

        public Builder() {
            $ = new InterconnectAttachmentPrivateInterconnectInfoArgs();
        }

        public Builder(InterconnectAttachmentPrivateInterconnectInfoArgs defaults) {
            $ = new InterconnectAttachmentPrivateInterconnectInfoArgs(Objects.requireNonNull(defaults));
        }

        public Builder tag8021q(@Nullable Output<Integer> tag8021q) {
            $.tag8021q = tag8021q;
            return this;
        }

        public Builder tag8021q(Integer tag8021q) {
            return tag8021q(Output.of(tag8021q));
        }

        public InterconnectAttachmentPrivateInterconnectInfoArgs build() {
            return $;
        }
    }

}
