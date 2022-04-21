// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListContainerAppSecretsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListContainerAppSecretsArgs Empty = new ListContainerAppSecretsArgs();

    /**
     * Name of the Container App.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private ListContainerAppSecretsArgs() {}

    private ListContainerAppSecretsArgs(ListContainerAppSecretsArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListContainerAppSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListContainerAppSecretsArgs $;

        public Builder() {
            $ = new ListContainerAppSecretsArgs();
        }

        public Builder(ListContainerAppSecretsArgs defaults) {
            $ = new ListContainerAppSecretsArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public ListContainerAppSecretsArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
