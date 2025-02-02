// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TemplateColumnGroupColumnSchema {
    /**
     * @return &lt;p&gt;The name of the column group&#39;s column schema.&lt;/p&gt;
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private TemplateColumnGroupColumnSchema(@CustomType.Parameter("name") @Nullable String name) {
        this.name = name;
    }

    /**
     * @return &lt;p&gt;The name of the column group&#39;s column schema.&lt;/p&gt;
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TemplateColumnGroupColumnSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(TemplateColumnGroupColumnSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public TemplateColumnGroupColumnSchema build() {
            return new TemplateColumnGroupColumnSchema(name);
        }
    }
}
