package com.habitrpg.android.habitica.ui.menu

data class HabiticaDrawerItem(val transitionId: Int, val identifier: String, val text: String, val isHeader: Boolean = false, var additionalInfoAsPill: Boolean = true) {
    constructor(transitionId: Int, identifier: String) : this(transitionId, identifier, "")

    var isPromo: Boolean = false
    var additionalInfo: String? = null
    var showBubble: Boolean = false
    var isVisible: Boolean = true
    var isEnabled: Boolean = true
}