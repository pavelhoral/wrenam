package org.forgerock.openam.hotfix;

/**
 * FIXME WREN Remove after the base class accepts fallback value
 */
public class LocalizableString extends org.forgerock.util.i18n.LocalizableString {

    public LocalizableString(String value) {
        super(value);
    }

    public LocalizableString(String value, ClassLoader loader) {
        super(value, loader);
    }

    public LocalizableString(String value, ClassLoader loader, org.forgerock.util.i18n.LocalizableString defaultValue) {
        super(value, loader);
    }

}
