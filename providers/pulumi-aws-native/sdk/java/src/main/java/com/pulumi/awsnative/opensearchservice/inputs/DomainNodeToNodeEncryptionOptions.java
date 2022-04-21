// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.opensearchservice.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DomainNodeToNodeEncryptionOptions extends com.pulumi.resources.InvokeArgs {

    public static final DomainNodeToNodeEncryptionOptions Empty = new DomainNodeToNodeEncryptionOptions();

    @Import(name="enabled")
    private @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    private DomainNodeToNodeEncryptionOptions() {}

    private DomainNodeToNodeEncryptionOptions(DomainNodeToNodeEncryptionOptions $) {
        this.enabled = $.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DomainNodeToNodeEncryptionOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DomainNodeToNodeEncryptionOptions $;

        public Builder() {
            $ = new DomainNodeToNodeEncryptionOptions();
        }

        public Builder(DomainNodeToNodeEncryptionOptions defaults) {
            $ = new DomainNodeToNodeEncryptionOptions(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        public DomainNodeToNodeEncryptionOptions build() {
            return $;
        }
    }

}
