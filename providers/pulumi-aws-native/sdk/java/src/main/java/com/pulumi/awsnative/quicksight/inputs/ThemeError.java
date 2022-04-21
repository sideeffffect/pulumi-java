// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.awsnative.quicksight.enums.ThemeErrorType;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Theme error.&lt;/p&gt;
 * 
 */
public final class ThemeError extends com.pulumi.resources.InvokeArgs {

    public static final ThemeError Empty = new ThemeError();

    /**
     * &lt;p&gt;The error message.&lt;/p&gt;
     * 
     */
    @Import(name="message")
    private @Nullable String message;

    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }

    @Import(name="type")
    private @Nullable ThemeErrorType type;

    public Optional<ThemeErrorType> type() {
        return Optional.ofNullable(this.type);
    }

    private ThemeError() {}

    private ThemeError(ThemeError $) {
        this.message = $.message;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ThemeError defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ThemeError $;

        public Builder() {
            $ = new ThemeError();
        }

        public Builder(ThemeError defaults) {
            $ = new ThemeError(Objects.requireNonNull(defaults));
        }

        public Builder message(@Nullable String message) {
            $.message = message;
            return this;
        }

        public Builder type(@Nullable ThemeErrorType type) {
            $.type = type;
            return this;
        }

        public ThemeError build() {
            return $;
        }
    }

}
