// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedZoneReverseLookupConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final ManagedZoneReverseLookupConfigArgs Empty = new ManagedZoneReverseLookupConfigArgs();

    @Import(name="kind")
    private @Nullable Output<String> kind;

    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    private ManagedZoneReverseLookupConfigArgs() {}

    private ManagedZoneReverseLookupConfigArgs(ManagedZoneReverseLookupConfigArgs $) {
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneReverseLookupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneReverseLookupConfigArgs $;

        public Builder() {
            $ = new ManagedZoneReverseLookupConfigArgs();
        }

        public Builder(ManagedZoneReverseLookupConfigArgs defaults) {
            $ = new ManagedZoneReverseLookupConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        public ManagedZoneReverseLookupConfigArgs build() {
            return $;
        }
    }

}
