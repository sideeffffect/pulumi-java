// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.databrew.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetRecipeArgs extends InvokeArgs {

    public static final GetRecipeArgs Empty = new GetRecipeArgs();

    /**
     * Recipe name
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return Recipe name
     * 
     */
    public String name() {
        return this.name;
    }

    private GetRecipeArgs() {}

    private GetRecipeArgs(GetRecipeArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRecipeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRecipeArgs $;

        public Builder() {
            $ = new GetRecipeArgs();
        }

        public Builder(GetRecipeArgs defaults) {
            $ = new GetRecipeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Recipe name
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public GetRecipeArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
