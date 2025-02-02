// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * &lt;p&gt;Secure Socket Layer (SSL) properties that apply when QuickSight connects to your
 *             underlying data source.&lt;/p&gt;
 * 
 */
public final class DataSourceSslPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceSslPropertiesArgs Empty = new DataSourceSslPropertiesArgs();

    /**
     * &lt;p&gt;A Boolean option to control whether SSL should be disabled.&lt;/p&gt;
     * 
     */
    @Import(name="disableSsl")
    private @Nullable Output<Boolean> disableSsl;

    /**
     * @return &lt;p&gt;A Boolean option to control whether SSL should be disabled.&lt;/p&gt;
     * 
     */
    public Optional<Output<Boolean>> disableSsl() {
        return Optional.ofNullable(this.disableSsl);
    }

    private DataSourceSslPropertiesArgs() {}

    private DataSourceSslPropertiesArgs(DataSourceSslPropertiesArgs $) {
        this.disableSsl = $.disableSsl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceSslPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceSslPropertiesArgs $;

        public Builder() {
            $ = new DataSourceSslPropertiesArgs();
        }

        public Builder(DataSourceSslPropertiesArgs defaults) {
            $ = new DataSourceSslPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disableSsl &lt;p&gt;A Boolean option to control whether SSL should be disabled.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder disableSsl(@Nullable Output<Boolean> disableSsl) {
            $.disableSsl = disableSsl;
            return this;
        }

        /**
         * @param disableSsl &lt;p&gt;A Boolean option to control whether SSL should be disabled.&lt;/p&gt;
         * 
         * @return builder
         * 
         */
        public Builder disableSsl(Boolean disableSsl) {
            return disableSsl(Output.of(disableSsl));
        }

        public DataSourceSslPropertiesArgs build() {
            return $;
        }
    }

}
