// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HeaderActionParametersResponse {
    /**
     * @return Action to perform
     * 
     */
    private final String headerAction;
    /**
     * @return Name of the header to modify
     * 
     */
    private final String headerName;
    private final String odataType;
    /**
     * @return Value for the specified action
     * 
     */
    private final @Nullable String value;

    @CustomType.Constructor
    private HeaderActionParametersResponse(
        @CustomType.Parameter("headerAction") String headerAction,
        @CustomType.Parameter("headerName") String headerName,
        @CustomType.Parameter("odataType") String odataType,
        @CustomType.Parameter("value") @Nullable String value) {
        this.headerAction = headerAction;
        this.headerName = headerName;
        this.odataType = odataType;
        this.value = value;
    }

    /**
     * @return Action to perform
     * 
     */
    public String headerAction() {
        return this.headerAction;
    }
    /**
     * @return Name of the header to modify
     * 
     */
    public String headerName() {
        return this.headerName;
    }
    public String odataType() {
        return this.odataType;
    }
    /**
     * @return Value for the specified action
     * 
     */
    public Optional<String> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HeaderActionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String headerAction;
        private String headerName;
        private String odataType;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HeaderActionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerAction = defaults.headerAction;
    	      this.headerName = defaults.headerName;
    	      this.odataType = defaults.odataType;
    	      this.value = defaults.value;
        }

        public Builder headerAction(String headerAction) {
            this.headerAction = Objects.requireNonNull(headerAction);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder odataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public HeaderActionParametersResponse build() {
            return new HeaderActionParametersResponse(headerAction, headerName, odataType, value);
        }
    }
}
