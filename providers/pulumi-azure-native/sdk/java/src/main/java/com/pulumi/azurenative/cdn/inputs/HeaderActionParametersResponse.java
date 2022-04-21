// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the request header action.
 * 
 */
public final class HeaderActionParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final HeaderActionParametersResponse Empty = new HeaderActionParametersResponse();

    /**
     * Action to perform
     * 
     */
    @Import(name="headerAction", required=true)
    private String headerAction;

    public String headerAction() {
        return this.headerAction;
    }

    /**
     * Name of the header to modify
     * 
     */
    @Import(name="headerName", required=true)
    private String headerName;

    public String headerName() {
        return this.headerName;
    }

    @Import(name="odataType", required=true)
    private String odataType;

    public String odataType() {
        return this.odataType;
    }

    /**
     * Value for the specified action
     * 
     */
    @Import(name="value")
    private @Nullable String value;

    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    private HeaderActionParametersResponse() {}

    private HeaderActionParametersResponse(HeaderActionParametersResponse $) {
        this.headerAction = $.headerAction;
        this.headerName = $.headerName;
        this.odataType = $.odataType;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HeaderActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HeaderActionParametersResponse $;

        public Builder() {
            $ = new HeaderActionParametersResponse();
        }

        public Builder(HeaderActionParametersResponse defaults) {
            $ = new HeaderActionParametersResponse(Objects.requireNonNull(defaults));
        }

        public Builder headerAction(String headerAction) {
            $.headerAction = headerAction;
            return this;
        }

        public Builder headerName(String headerName) {
            $.headerName = headerName;
            return this;
        }

        public Builder odataType(String odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder value(@Nullable String value) {
            $.value = value;
            return this;
        }

        public HeaderActionParametersResponse build() {
            $.headerAction = Objects.requireNonNull($.headerAction, "expected parameter 'headerAction' to be non-null");
            $.headerName = Objects.requireNonNull($.headerName, "expected parameter 'headerName' to be non-null");
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            return $;
        }
    }

}
