// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.foobar.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TopLevel {
    private final @Nullable String buzz;

    @OutputCustomType.Constructor({"buzz"})
    private TopLevel(@Nullable String buzz) {
        this.buzz = buzz;
    }

    public Optional<String> getBuzz() {
        return Optional.ofNullable(this.buzz);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopLevel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String buzz;

        public Builder() {
    	      // Empty
        }

        public Builder(TopLevel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.buzz = defaults.buzz;
        }

        public Builder setBuzz(@Nullable String buzz) {
            this.buzz = buzz;
            return this;
        }

        public TopLevel build() {
            return new TopLevel(buzz);
        }
    }
}
