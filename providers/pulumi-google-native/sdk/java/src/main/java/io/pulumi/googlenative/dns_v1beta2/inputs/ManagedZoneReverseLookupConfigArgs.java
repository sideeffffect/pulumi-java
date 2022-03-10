// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedZoneReverseLookupConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedZoneReverseLookupConfigArgs Empty = new ManagedZoneReverseLookupConfigArgs();

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    public ManagedZoneReverseLookupConfigArgs(@Nullable Input<String> kind) {
        this.kind = kind;
    }

    private ManagedZoneReverseLookupConfigArgs() {
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZoneReverseLookupConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZoneReverseLookupConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }
        public ManagedZoneReverseLookupConfigArgs build() {
            return new ManagedZoneReverseLookupConfigArgs(kind);
        }
    }
}
